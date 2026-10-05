package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Carrier;
import com.naissant.naissantapp.entity.DispatchsLabels;
import com.naissant.naissantapp.domain.carriers.CarrierOrderResponse;

public interface CarrierDispatchService {

    boolean supports(Carrier carrier);

    CarrierOrderResponse dispatchOrder(DispatchsLabels dispatchsLabels);
}
