/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Modules;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.ModulesRepository;
import com.naissant.naissantapp.service.ModulesService;

@Service
public class ModulesServiceImp implements ModulesService{
    @Autowired
    private ModulesRepository repository;
    
    @Override
    public List<Modules> listar() {
        return repository.findAll();
    }

    @Override
    public Modules listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Modules add(Modules m) {
        return repository.save(Audit.created(m));
    }

    @Override
    public Modules edit(Modules m) {
        return repository.save(Audit.updated(m));
    }
    
    @Override
    public List<Modules> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Modules delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
