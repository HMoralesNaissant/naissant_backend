/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ConveyorAccounts;
import com.naissant.naissantapp.Repository.ConveyorAccountsRepository;
import com.naissant.naissantapp.Service.ConveyorAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConveyorAccountsServiceImp implements ConveyorAccountsService{
    @Autowired
    private ConveyorAccountsRepository repository;
    
    @Override
    public List<ConveyorAccounts> listar() {
        return repository.findAll();
    }

    @Override
    public ConveyorAccounts listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public ConveyorAccounts add(ConveyorAccounts c) {
        return repository.save(c);
    }

    @Override
    public ConveyorAccounts edit(ConveyorAccounts c) {
        return repository.save(c);
    }
    
    @Override
    public List<ConveyorAccounts> listarByIdConveyor(int id_conveyor) {
        return repository.findByConveyorId_Id(id_conveyor);
    }

    @Override
    public ConveyorAccounts delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
