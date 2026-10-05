/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.entity.CarrierAccounts;
import com.naissant.naissantapp.repository.CarrierAccountsRepository;
import com.naissant.naissantapp.service.CarrierAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrierAccountsServiceImp implements CarrierAccountsService{
    @Autowired
    private CarrierAccountsRepository repository;
    
    @Override
    public List<CarrierAccounts> listar() {
        return repository.findAll();
    }

    @Override
    public CarrierAccounts listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public CarrierAccounts add(CarrierAccounts c) {
        return repository.save(c);
    }

    @Override
    public CarrierAccounts edit(CarrierAccounts c) {
        return repository.save(c);
    }
    
    @Override
    public List<CarrierAccounts> listarByIdCarrier(int id_carrier) {
        return repository.findByCarrierId_Id(id_carrier);
    }

    @Override
    public CarrierAccounts delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
