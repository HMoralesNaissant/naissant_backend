/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.EconomicActivity;
import com.naissant.naissantapp.service.EconomicActivityService;
import com.naissant.naissantapp.repository.EconomicActivityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EconomicActivityServiceImp implements EconomicActivityService{
    @Autowired
    private EconomicActivityRepository repository;
    
    @Override
    public List<EconomicActivity> listar() {
        return repository.findAll();
    }

    @Override
    public EconomicActivity listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public EconomicActivity add(EconomicActivity a) {
        return repository.save(Audit.created(a));
    }

    @Override
    public EconomicActivity edit(EconomicActivity a) {
        return repository.save(Audit.updated(a));
    }
    
    @Override
    public EconomicActivity delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
