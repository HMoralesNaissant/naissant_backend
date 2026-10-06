/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Options;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.OptionsRepository;
import com.naissant.naissantapp.service.OptionsService;

@Service
public class OptionsServiceImp implements OptionsService{
    @Autowired
    private OptionsRepository repository;
    
    @Override
    public List<Options> listar() {
        return repository.findAll();
    }

    @Override
    public Options listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Options add(Options o) {
        return repository.save(Audit.created(o));
    }

    @Override
    public Options edit(Options o) {
        return repository.save(Audit.updated(o));
    }
    
    @Override
    public List<Options> listarByIdModule(int id_module) {
        return repository.findByModuleId_Id(id_module);
    }

    @Override
    public Options delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
