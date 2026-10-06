/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.EntitiesArl;
import com.naissant.naissantapp.service.EntitiesArlService;
import com.naissant.naissantapp.repository.EntitiesArlRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntitiesArlServiceImp implements EntitiesArlService{
    @Autowired
    private EntitiesArlRepository repository;
    
    @Override
    public List<EntitiesArl> listar() {
        return repository.findAll();
    }

    @Override
    public EntitiesArl listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public EntitiesArl add(EntitiesArl a) {
        return repository.save(Audit.created(a));
    }

    @Override
    public EntitiesArl edit(EntitiesArl a) {
        return repository.save(Audit.updated(a));
    }
    
    @Override
    public List<EntitiesArl> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public EntitiesArl delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
