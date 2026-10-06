/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Consecutives;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.naissant.naissantapp.repository.ConsecutivesRepository;
import com.naissant.naissantapp.service.ConsecutivesService;

@Service
public class ConsecutivesServiceImp implements ConsecutivesService {
    @Autowired
    private ConsecutivesRepository repository;
    
    @Override
    public List<Consecutives> listar() {
        return repository.findAll();
    }

    @Override
    public Consecutives listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Consecutives add(Consecutives c) {
        return repository.save(Audit.created(c));
    }

    @Override
    public Consecutives edit(Consecutives c) {
        return repository.save(Audit.updated(c));
    }
    
    @Override
    public List<Consecutives> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public List<Consecutives> listarByIdVoucherstype(int id_voucherstype) {
        return repository.findByVoucherstypeId_Id(id_voucherstype);
    }

    @Override
    public Consecutives delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
