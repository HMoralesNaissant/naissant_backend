/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Charges;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.ChargesRepository;
import com.naissant.naissantapp.service.ChargesService;

@Service
public class ChargesServiceImp implements ChargesService{
    @Autowired
    private ChargesRepository repository;
    
    @Override
    public List<Charges> listar() {
        return repository.findAll();
    }

    @Override
    public Charges listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Charges add(Charges c) {
        return repository.save(Audit.created(c));
    }

    @Override
    public Charges edit(Charges c) {
        return repository.save(Audit.updated(c));
    }
    
    @Override
    public List<Charges> listarByIdAreas(int id_areas) {
        return repository.findByAreasId_Id(id_areas);
    }

    @Override
    public Charges delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
