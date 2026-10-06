/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Banks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.naissant.naissantapp.repository.BanksRepository;
import com.naissant.naissantapp.service.BanksService;

@Service
public class BanksServiceImp implements BanksService {
    @Autowired
    private BanksRepository repository;

    @Override
    public List<Banks> listar() {
        return repository.findAll();
    }

    @Override
    public Banks listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Banks add(Banks b) {
        return repository.save(Audit.created(b));
    }

    @Override
    public Banks edit(Banks b) {
        return repository.save(Audit.updated(b));
    }
    
    @Override
    public List<Banks> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Banks delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
