package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Carrier;
import com.naissant.naissantapp.Entity.DispatchsLabels;
import com.naissant.naissantapp.domain.carriers.CarrierOrderResponse;

public interface CarrierDispatchService {

    boolean supports(Carrier carrier);

    CarrierOrderResponse dispatchOrder(DispatchsLabels dispatchsLabels);
}
