/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Zones;
import com.naissant.naissantapp.Service.ZonesService;
import com.naissant.naissantapp.Repository.ZonesRepository;
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
        return repository.save(z);
    }

    @Override
    public Zones edit(Zones z) {
        return repository.save(z);
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
