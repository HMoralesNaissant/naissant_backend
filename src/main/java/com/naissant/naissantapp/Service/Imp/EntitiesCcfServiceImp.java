/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.EntitiesCcf;
import com.naissant.naissantapp.Service.EntitiesCcfService;
import com.naissant.naissantapp.Repository.EntitiesCcfRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntitiesCcfServiceImp implements EntitiesCcfService{
    @Autowired
    private EntitiesCcfRepository repository;
    
    @Override
    public List<EntitiesCcf> listar() {
        return repository.findAll();
    }

    @Override
    public EntitiesCcf listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public EntitiesCcf add(EntitiesCcf c) {
        return repository.save(c);
    }

    @Override
    public EntitiesCcf edit(EntitiesCcf c) {
        return repository.save(c);
    }
    
    @Override
    public List<EntitiesCcf> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public EntitiesCcf delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
