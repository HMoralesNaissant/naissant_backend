/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.UndMeasures;
import com.naissant.naissantapp.Service.UndMeasuresService;
import com.naissant.naissantapp.Repository.UndMeasuresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UndMeasuresServiceImp implements UndMeasuresService{
    @Autowired
    private UndMeasuresRepository repository;
    
    @Override
    public List<UndMeasures> listar() {
        return repository.findAll();
    }

    @Override
    public UndMeasures listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public UndMeasures add(UndMeasures u) {
        return repository.save(u);
    }

    @Override
    public UndMeasures edit(UndMeasures u) {
        return repository.save(u);
    }
    
    @Override
    public List<UndMeasures> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public UndMeasures delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
