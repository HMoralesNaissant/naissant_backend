/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.entity.Branches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.naissant.naissantapp.repository.BranchesRepository;
import com.naissant.naissantapp.service.BranchesService;

@Service
public class BranchesServiceImp implements BranchesService{
    @Autowired
    private BranchesRepository repository;
    
    @Override
    public List<Branches> listar() {
        return repository.findAll();
    }

    @Override
    public Branches listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Branches add(Branches b) {
        return repository.save(b);
    }

    @Override
    public Branches edit(Branches b) {
        return repository.save(b);
    }
    
    @Override
    public List<Branches> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Branches delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}