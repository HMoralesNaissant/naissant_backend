/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.CarrierAccounts;
import java.util.List;


public interface CarrierAccountsService {
    List<CarrierAccounts>listar();
    CarrierAccounts listarId(int id);
    CarrierAccounts add(CarrierAccounts c);
    CarrierAccounts edit(CarrierAccounts c);
    CarrierAccounts delete(int id);
    
    List<CarrierAccounts>listarByIdCarrier(int id_carrier);
}
