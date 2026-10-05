package com.naissant.naissantapp.Service.Dispatching.Carrier;

import com.fasterxml.jackson.databind.JsonNode;
import com.naissant.naissantapp.Entity.Company;
import com.naissant.naissantapp.Entity.Carrier;
import com.naissant.naissantapp.Entity.CarrierAccounts;
import com.naissant.naissantapp.Entity.Citys;
import com.naissant.naissantapp.Entity.DispatchsLabels;
import com.naissant.naissantapp.Entity.InvoicesHeader;
import com.naissant.naissantapp.Repository.CitysRepository;
import com.naissant.naissantapp.Repository.CompanyRepository;
import com.naissant.naissantapp.Repository.CarrierAccountsRepository;
import com.naissant.naissantapp.Repository.CarrierRepository;
import com.naissant.naissantapp.Repository.InvoicesHeaderRepository;
import com.naissant.naissantapp.Service.CarrierDispatchService;
import com.naissant.naissantapp.domain.carriers.EnviaDispatchRequest;
import com.naissant.naissantapp.domain.carriers.EnviaDispatchResponse;
import com.naissant.naissantapp.domain.carriers.EnviaAccountConfiguration;
import com.naissant.naissantapp.domain.carriers.EnviaServiceConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

@Service
public class EnviaDispatchService implements CarrierDispatchService {

    private static final String CARRIER_NAME = "Envia";
    private static final Logger LOG = LoggerFactory.getLogger(EnviaDispatchService.class);
    private final WebClient webClient;
    private final ObjectMapper objectMapper;
    private final CarrierRepository carrierRepository;
    private final CarrierAccountsRepository carrierAccountsRepository;
    private final InvoicesHeaderRepository invoicesHeaderRepository;
    private final CompanyRepository companyRepository;
    private final CitysRepository citysRepository;

    public EnviaDispatchService(
            WebClient.Builder webClientBuilder,
            ObjectMapper objectMapper,
            CarrierRepository carrierRepository,
            CarrierAccountsRepository carrierAccountsRepository,
            InvoicesHeaderRepository invoicesHeaderRepository,
            CompanyRepository companyRepository,
            CitysRepository citysRepository) {
        this.webClient = webClientBuilder.build();
        this.objectMapper = objectMapper;
        this.carrierRepository = carrierRepository;
        this.carrierAccountsRepository = carrierAccountsRepository;
        this.invoicesHeaderRepository = invoicesHeaderRepository;
        this.companyRepository = companyRepository;
        this.citysRepository = citysRepository;
    }

    @Override
    public boolean supports(Carrier carrier) {
        return carrier != null
                && carrier.getDescription() != null
                && CARRIER_NAME.equalsIgnoreCase(carrier.getDescription().trim());
    }

    public EnviaDispatchRequest generateOrderRequest(DispatchsLabels dispatchsLabels) {
        if (dispatchsLabels == null) {
            throw new IllegalArgumentException("Dispatch details are required");
        }
        loadRelatedEntities(dispatchsLabels);

        EnviaDispatchRequest request = new EnviaDispatchRequest();
        request.setCiudadOrigen(dispatchsLabels.getOriginId() == null
                ? null : dispatchsLabels.getOriginId().getCod_dane());
        request.setCiudadDestino(dispatchsLabels.getDestinationId() == null
                ? null : dispatchsLabels.getDestinationId().getCod_dane());
        request.setNumUnidades(dispatchsLabels.getBoxes());
        request.setMpesoRealK(dispatchsLabels.getWeight_kg());
        request.setValorDeclarado(dispatchsLabels.getDeclared_value());
        request.setCodCuenta(dispatchsLabels.getCarrierAccId() == null
                ? null : dispatchsLabels.getCarrierAccId().getAccounts());

        JsonNode additionalInfo = dispatchsLabels.getAdditionalInfo() == null
                ? null : objectMapper.valueToTree(dispatchsLabels.getAdditionalInfo());

        request.setCodServicio(readValue(additionalInfo, Integer.class,
                "cod_servicio", "codservicio"));
        request.setCodFormaPago(readValue(additionalInfo, Integer.class,
                "cod_formaPago", "cod_forma_pago", "cod_formapago"));
        request.setMpesoVolumenK(readValue(additionalInfo, java.math.BigDecimal.class,
                "mpesovolumen_k"));
        request.setMcaNoSabado(readValue(additionalInfo, Integer.class, "mca_nosabado"));
        Integer international = readValue(additionalInfo, Integer.class, "mca_docinternacional");
        request.setMcaDocInternacional(international == null ? 0 : international);
        String cartaPorte = readValue(additionalInfo, String.class, "con_cartaporte");
        request.setConCartaporte(cartaPorte == null ? "0" : cartaPorte);
        EnviaAccountConfiguration accountConfiguration = getAccountConfiguration(dispatchsLabels);
        if (accountConfiguration != null) {
            request.setCodRegionalCta(accountConfiguration.getCodRegionalCta());
            request.setCodOficinaCta(accountConfiguration.getCodOficinaCta());
        }
        request.setInfoOrigen(createOrigin(dispatchsLabels));
        request.setInfoDestino(createDestination(dispatchsLabels));
        EnviaDispatchRequest.ContentInfo content = createContent(dispatchsLabels);
        String diceContener = readValue(additionalInfo, String.class, "dice_contener");
        String textoGuia = readValue(additionalInfo, String.class, "texto_guia");
        String centroCosto = readValue(additionalInfo, String.class, "centro_costo", "centrocosto");
        if (diceContener != null || textoGuia != null || centroCosto != null) {
            if (content == null) {
                content = new EnviaDispatchRequest.ContentInfo();
            }
            content.setDiceContener(diceContener);
            content.setTextoGuia(textoGuia);
            content.setCentroCosto(centroCosto);
        }
        request.setInfoContenido(content);
        request.setGenerarOs(readValue(additionalInfo, String.class, "generar_os"));
        return request;
    }

    private <T> T readValue(JsonNode additionalInfo, Class<T> valueType, String... fieldNames) {
        if (additionalInfo == null || !additionalInfo.isObject()) {
            return null;
        }
        for (String fieldName : fieldNames) {
            JsonNode value = additionalInfo.get(fieldName);
            if (value != null && !value.isNull()) {
                return objectMapper.convertValue(value, valueType);
            }
        }
        return null;
    }

    private EnviaAccountConfiguration getAccountConfiguration(DispatchsLabels dispatchsLabels) {
        if (dispatchsLabels.getCarrierAccId() == null
                || dispatchsLabels.getCarrierAccId().getAccountsConfiguration() == null) {
            return null;
        }
        return objectMapper.convertValue(
                dispatchsLabels.getCarrierAccId().getAccountsConfiguration(),
                EnviaAccountConfiguration.class);
    }

    @Override
    public EnviaDispatchResponse dispatchOrder(DispatchsLabels dispatchsLabels) {
        if (dispatchsLabels == null || dispatchsLabels.getCarrierId() == null) {
            throw new IllegalArgumentException("Dispatch carrier configuration is required");
        }
        Carrier carrier = carrierRepository.findById(dispatchsLabels.getCarrierId().getId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "Carrier " + dispatchsLabels.getCarrierId().getId() + " was not found"));
        dispatchsLabels.setCarrierId(carrier);
        EnviaServiceConfiguration configuration = getConfiguration(carrier.getCarrierConfiguration());

        EnviaDispatchRequest request = generateOrderRequest(dispatchsLabels);
        try {
            LOG.info("Envia generation request body: {}", objectMapper.writeValueAsString(request));
        } catch (JsonProcessingException error) {
            LOG.error("Failed to serialize Envia generation request body", error);
        }
        return webClient.post()
                .uri(configuration.getGenerationUrl())
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .headers(headers -> headers.setBasicAuth(
                        configuration.getUsername(), configuration.getPassword()))
                .bodyValue(request)
                .exchangeToMono(this::readResponse)
                .timeout(Duration.ofSeconds(30))
                .doOnError(error -> LOG.error("Envia generation request failed", error))
                .onErrorResume(TimeoutException.class, error -> Mono.empty())
                .onErrorResume(
                        org.springframework.web.reactive.function.client.WebClientRequestException.class,
                        error -> Mono.empty())
                .block();
    }

    private Mono<EnviaDispatchResponse> readResponse(ClientResponse response) {
        HttpStatus status = response.statusCode();
        return response.bodyToMono(String.class)
                .defaultIfEmpty("")
                .flatMap(body -> {
                    LOG.info("Envia generation response: status={}, body={}", status.value(), body);
                    if (!status.is2xxSuccessful() || !StringUtils.hasText(body)) {
                        return Mono.empty();
                    }
                    try {
                        return Mono.just(objectMapper.readValue(body, EnviaDispatchResponse.class));
                    } catch (JsonProcessingException error) {
                        LOG.error("Failed to parse Envia generation response: {}", body, error);
                        return Mono.empty();
                    }
                });
    }

    private void loadRelatedEntities(DispatchsLabels dispatchsLabels) {
        if (dispatchsLabels.getOriginId() != null) {
            Citys city = citysRepository.findById(dispatchsLabels.getOriginId().getId())
                    .orElseThrow(() -> new IllegalArgumentException(
                            "Origin city " + dispatchsLabels.getOriginId().getId() + " was not found"));
            dispatchsLabels.setOriginId(city);
        }
        if (dispatchsLabels.getDestinationId() != null) {
            Citys city = citysRepository.findById(dispatchsLabels.getDestinationId().getId())
                    .orElseThrow(() -> new IllegalArgumentException(
                            "Destination city " + dispatchsLabels.getDestinationId().getId()
                                    + " was not found"));
            dispatchsLabels.setDestinationId(city);
        }
        if (dispatchsLabels.getCarrierAccId() != null) {
            CarrierAccounts account = carrierAccountsRepository.findById(
                            dispatchsLabels.getCarrierAccId().getId())
                    .orElseThrow(() -> new IllegalArgumentException(
                            "Carrier account " + dispatchsLabels.getCarrierAccId().getId()
                                    + " was not found"));
            dispatchsLabels.setCarrierAccId(account);
        }
        if (dispatchsLabels.getInvoiceId() != null) {
            InvoicesHeader invoice = invoicesHeaderRepository.findById(
                            dispatchsLabels.getInvoiceId().getId())
                    .orElseThrow(() -> new IllegalArgumentException(
                            "Invoice " + dispatchsLabels.getInvoiceId().getId() + " was not found"));
            if (invoice.getCompanyId() != null) {
                Company company = companyRepository.findById(invoice.getCompanyId().getId())
                        .orElseThrow(() -> new IllegalArgumentException(
                                "Invoice company " + invoice.getCompanyId().getId() + " was not found"));
                invoice.setCompanyId(company);
            }
            dispatchsLabels.setInvoiceId(invoice);
        }
    }

    private EnviaServiceConfiguration getConfiguration(Object carrierConfiguration) {
        if (carrierConfiguration == null) {
            throw new IllegalStateException("Envia carrierConfiguration is not configured on the carrier");
        }

        EnviaServiceConfiguration configuration =
                objectMapper.convertValue(carrierConfiguration, EnviaServiceConfiguration.class);
        if (configuration == null
                || !StringUtils.hasText(configuration.getGenerationUrl())
                || !StringUtils.hasText(configuration.getUsername())
                || !StringUtils.hasText(configuration.getPassword())) {
            throw new IllegalStateException(
                    "Envia carrierConfiguration must provide generationUrl, username, and password");
        }
        return configuration;
    }

    private EnviaDispatchRequest.OriginInfo createOrigin(DispatchsLabels dispatchsLabels) {
        InvoicesHeader invoice = dispatchsLabels.getInvoiceId();
        Company company = invoice == null ? null : invoice.getCompanyId();
        if (company == null) {
            return null;
        }

        EnviaDispatchRequest.OriginInfo origin = new EnviaDispatchRequest.OriginInfo();
        origin.setNomRemitente(company.getDescription());
        origin.setDirRemitente(company.getAddress());
        origin.setTelRemitente(
                company.getPhone() == null ? company.getCellular() : company.getPhone());
        origin.setCedRemitente(company.getNit());
        return origin;
    }

    private EnviaDispatchRequest.DestinationInfo createDestination(DispatchsLabels dispatchsLabels) {
        InvoicesHeader invoice = dispatchsLabels.getInvoiceId();
        if (invoice == null) {
            return null;
        }

        EnviaDispatchRequest.DestinationInfo destination =
                new EnviaDispatchRequest.DestinationInfo();
        destination.setNomDestinatario(invoice.getCustomer());
        destination.setDirDestinatario(invoice.getBranch_address());
        destination.setCedDestinatario(
                invoice.getNit() == null ? null : invoice.getNit().toString());
        return destination;
    }

    private EnviaDispatchRequest.ContentInfo createContent(DispatchsLabels dispatchsLabels) {
        EnviaDispatchRequest.ContentInfo content = new EnviaDispatchRequest.ContentInfo();
        content.setAccionNotaGuia(dispatchsLabels.getObservations());

        InvoicesHeader invoice = dispatchsLabels.getInvoiceId();
        content.setNumDocumentos(
                invoice == null || invoice.getInvoice() == null
                        ? null : invoice.getInvoice().toString());
        return content.getAccionNotaGuia() == null && content.getNumDocumentos() == null
                ? null : content;
    }
}
