package com.naissant.naissantapp.service.dispatching.carrier;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;
import com.naissant.naissantapp.entity.DispatchsLabels;
import com.naissant.naissantapp.repository.CarrierAccountsRepository;
import com.naissant.naissantapp.repository.CarrierRepository;
import com.naissant.naissantapp.repository.CitysRepository;
import com.naissant.naissantapp.repository.CompanyRepository;
import com.naissant.naissantapp.repository.InvoicesHeaderRepository;
import com.naissant.naissantapp.domain.carriers.EnviaDispatchRequest;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

class EnviaDispatchServiceTest {

    @Test
    void mapsAdditionalInfoFieldsIntoRequest() {
        Map<String, Object> additionalInfo = new LinkedHashMap<>();
        additionalInfo.put("cod_formaPago", 4);
        additionalInfo.put("mpesovolumen_k", "2");
        additionalInfo.put("mca_nosabado", 1);
        additionalInfo.put("mca_docinternacional", 0);
        additionalInfo.put("con_cartaporte", "0");
        additionalInfo.put("dice_contener", "Productos Capilares");
        additionalInfo.put("texto_guia", "");
        additionalInfo.put("centro_costo", "15;1502");
        additionalInfo.put("generar_os", "N");

        DispatchsLabels dispatch = new DispatchsLabels();
        dispatch.setAdditionalInfo(additionalInfo);
        EnviaDispatchService service = new EnviaDispatchService(
                WebClient.builder(),
                JsonMapper.builder().build(),
                mock(CarrierRepository.class),
                mock(CarrierAccountsRepository.class),
                mock(InvoicesHeaderRepository.class),
                mock(CompanyRepository.class),
                mock(CitysRepository.class));

        EnviaDispatchRequest request = service.generateOrderRequest(dispatch);

        assertEquals(4, request.getCodFormaPago());
        assertEquals(new BigDecimal("2"), request.getMpesoVolumenK());
        assertEquals(1, request.getMcaNoSabado());
        assertEquals(0, request.getMcaDocInternacional());
        assertEquals("0", request.getConCartaporte());
        assertEquals("Productos Capilares", request.getInfoContenido().getDiceContener());
        assertEquals("", request.getInfoContenido().getTextoGuia());
        assertEquals("15;1502", request.getInfoContenido().getCentroCosto());
        assertEquals("N", request.getGenerarOs());

        JsonNode json = JsonMapper.builder().build().valueToTree(request);
        assertEquals(4, json.get("cod_formapago").asInt());
        assertEquals("2", json.get("mpesovolumen_k").asText());
        assertEquals("15;1502", json.get("info_contenido").get("centrocosto").asText());
        assertNotNull(json.get("info_contenido"));
    }
}
