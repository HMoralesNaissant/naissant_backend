package com.naissant.naissantapp.service.dispatching;

import com.naissant.naissantapp.entity.Carrier;
import com.naissant.naissantapp.entity.DispatchLabelsResponse;
import com.naissant.naissantapp.entity.DispatchsLabels;
import com.naissant.naissantapp.entity.InvoicesHeader;
import com.naissant.naissantapp.repository.CarrierRepository;
import com.naissant.naissantapp.repository.DispatchLabelsResponseRepository;
import com.naissant.naissantapp.service.CarrierDispatchService;
import com.naissant.naissantapp.domain.DispatchBodyDto;
import com.naissant.naissantapp.domain.carriers.CarrierOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarriersDispatchersHandlerService {

    private final List<CarrierDispatchService> carrierServices;
    private final DispatchLabelsResponseRepository responseRepository;
    private final CarrierRepository carrierRepository;

    @Autowired
    public CarriersDispatchersHandlerService(
            List<CarrierDispatchService> carrierServices,
            DispatchLabelsResponseRepository responseRepository,
            CarrierRepository carrierRepository) {
        this.carrierServices = carrierServices;
        this.responseRepository = responseRepository;
        this.carrierRepository = carrierRepository;
    }

    public CarrierDispatchService getCarrierService(Carrier carrier) {
        if (carrier == null) {
            throw new IllegalArgumentException("A carrier must be specified for the dispatch");
        }

        Carrier persistedCarrier = carrierRepository.findById(carrier.getId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "Carrier " + carrier.getId() + " was not found"));
        return findCarrierService(persistedCarrier);
    }

    private CarrierDispatchService findCarrierService(Carrier carrier) {
        List<CarrierDispatchService> matchingServices = carrierServices.stream()
                .filter(service -> service.supports(carrier))
                .collect(Collectors.toList());

        if (matchingServices.isEmpty()) {
            throw new IllegalArgumentException(
                    "No dispatch service is registered for carrier " + carrier.getDescription()
            );
        }
        if (matchingServices.size() > 1) {
            throw new IllegalStateException(
                    "More than one dispatch service is registered for carrier " + carrier.getDescription()
            );
        }

        return matchingServices.get(0);
    }

    public CarrierOrderResponse handleDispatch(DispatchBodyDto dispatchBodyDto) {
        if (dispatchBodyDto == null || dispatchBodyDto.getDispatchsLabels() == null) {
            throw new IllegalArgumentException("Dispatch details are required");
        }

        DispatchsLabels dispatchsLabels = dispatchBodyDto.getDispatchsLabels();
        if (dispatchsLabels.getCarrierId() == null) {
            throw new IllegalArgumentException("A carrier must be specified for the dispatch");
        }
        Carrier carrier = carrierRepository.findById(dispatchsLabels.getCarrierId().getId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "Carrier " + dispatchsLabels.getCarrierId().getId() + " was not found"));
        dispatchsLabels.setCarrierId(carrier);
        CarrierOrderResponse carrierResponse =
                findCarrierService(carrier).dispatchOrder(dispatchsLabels);
        responseRepository.save(createResponseRecord(dispatchsLabels, carrierResponse));
        return carrierResponse;
    }

    private DispatchLabelsResponse createResponseRecord(
            DispatchsLabels dispatchsLabels, CarrierOrderResponse carrierResponse) {
        DispatchLabelsResponse record = new DispatchLabelsResponse();
        record.setDispatchLabelId(dispatchsLabels.getId());
        record.setResponse(carrierResponse);
        record.setCarrierId(dispatchsLabels.getCarrierId().getId());
        record.setLabel(dispatchsLabels.getLabel());

        char status = dispatchsLabels.getStatus();
        if (status != '\0') {
            record.setStatus(String.valueOf(status));
        }
        record.setUserCreate(dispatchsLabels.getUser_create());
        record.setDateCreate(dispatchsLabels.getDate_create() == null
                ? new Date() : dispatchsLabels.getDate_create());

        InvoicesHeader invoice = dispatchsLabels.getInvoiceId();
        if (invoice != null) {
            record.setInvoice(invoice.getInvoice() == null ? null : invoice.getInvoice().floatValue());
            record.setCustomerCode(invoice.getCustomer_code());
        }
        record.setDestination(dispatchsLabels.getDestinationId() == null
                ? null : dispatchsLabels.getDestinationId().getDescription());
        return record;
    }

}
