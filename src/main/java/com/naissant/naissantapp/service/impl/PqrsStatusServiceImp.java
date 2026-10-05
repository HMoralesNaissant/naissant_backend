/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.entity.PqrsStatus;
import com.naissant.naissantapp.service.PqrsStatusService;
import com.naissant.naissantapp.repository.PqrsStatusRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PqrsStatusServiceImp implements PqrsStatusService{
    @Autowired
    private PqrsStatusRepository repository;
    
    @Override
    public List<PqrsStatus> listar() {
        return repository.findAll();
    }

    @Override
    public PqrsStatus listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public PqrsStatus add(PqrsStatus p) {
        return repository.save(p);
    }

    @Override
    public PqrsStatus edit(PqrsStatus p) {
        return repository.save(p);
    }
    
    @Override
    public List<PqrsStatus> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public PqrsStatus delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
