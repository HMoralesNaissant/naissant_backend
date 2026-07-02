/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.EconomicActivity;
import com.naissant.naissantapp.Service.EconomicActivityService;
import com.naissant.naissantapp.Repository.EconomicActivityRepository;
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
        return repository.save(a);
    }

    @Override
    public EconomicActivity edit(EconomicActivity a) {
        return repository.save(a);
    }
    
    @Override
    public EconomicActivity delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
