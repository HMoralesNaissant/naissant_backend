/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Taxes;
import com.naissant.naissantapp.service.TaxesService;
import com.naissant.naissantapp.repository.TaxesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxesServiceImp implements TaxesService{
    @Autowired
    private TaxesRepository repository;
    
    @Override
    public List<Taxes> listar() {
        return repository.findAll();
    }

    @Override
    public Taxes listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Taxes add(Taxes t) {
        return repository.save(Audit.created(t));
    }

    @Override
    public Taxes edit(Taxes t) {
        return repository.save(Audit.updated(t));
    }
    
    @Override
    public List<Taxes> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Taxes delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
