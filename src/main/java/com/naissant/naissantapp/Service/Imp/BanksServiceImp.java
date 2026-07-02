/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Banks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.naissant.naissantapp.Repository.BanksRepository;
import com.naissant.naissantapp.Service.BanksService;

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
        return repository.save(b);
    }

    @Override
    public Banks edit(Banks b) {
        return repository.save(b);
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
