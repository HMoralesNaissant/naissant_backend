/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Franchises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.naissant.naissantapp.Repository.FranchisesRepository;
import com.naissant.naissantapp.Service.FranchisesService;

@Service
public class FranchisesServiceImp implements FranchisesService {
    
    @Autowired
    private FranchisesRepository repository;

    @Override
    public List<Franchises> listar() {
        return repository.findAll();
    }

    @Override
    public Franchises listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Franchises add(Franchises f) {
        return repository.save(f);
    }

    @Override
    public Franchises edit(Franchises f) {
        return repository.save(f);
    }
    
    @Override
    public List<Franchises> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Franchises delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}