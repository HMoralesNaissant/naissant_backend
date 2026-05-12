/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.EntitiesTemporary;
import com.naissant.naissantapp.Service.EntitiesTemporaryService;
import com.naissant.naissantapp.Repository.EntitiesTemporaryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntitiesTemporaryServiceImp implements EntitiesTemporaryService{
    @Autowired
    private EntitiesTemporaryRepository repository;
    
    @Override
    public List<EntitiesTemporary> listar() {
        return repository.findAll();
    }

    @Override
    public EntitiesTemporary listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public EntitiesTemporary add(EntitiesTemporary a) {
        return repository.save(a);
    }

    @Override
    public EntitiesTemporary edit(EntitiesTemporary t) {
        return repository.save(t);
    }
    
    @Override
    public List<EntitiesTemporary> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public EntitiesTemporary delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
