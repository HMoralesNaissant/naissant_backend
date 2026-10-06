/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Zones;
import com.naissant.naissantapp.service.ZonesService;
import com.naissant.naissantapp.repository.ZonesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZonesServiceImp implements ZonesService{
    @Autowired
    private ZonesRepository repository;
    
    @Override
    public List<Zones> listar() {
        return repository.findAll();
    }

    @Override
    public Zones listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Zones add(Zones z) {
        return repository.save(Audit.created(z));
    }

    @Override
    public Zones edit(Zones z) {
        return repository.save(Audit.updated(z));
    }
    
    @Override
    public List<Zones> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Zones delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
