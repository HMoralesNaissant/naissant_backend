/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.EntitiesEps;
import com.naissant.naissantapp.Service.EntitiesEpsService;
import com.naissant.naissantapp.Repository.EntitiesEpsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntitiesEpsServiceImp implements EntitiesEpsService{
    @Autowired
    private EntitiesEpsRepository repository;
    
    @Override
    public List<EntitiesEps> listar() {
        return repository.findAll();
    }

    @Override
    public EntitiesEps listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public EntitiesEps add(EntitiesEps p) {
        return repository.save(p);
    }

    @Override
    public EntitiesEps edit(EntitiesEps p) {
        return repository.save(p);
    }
    
    @Override
    public List<EntitiesEps> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public EntitiesEps delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
