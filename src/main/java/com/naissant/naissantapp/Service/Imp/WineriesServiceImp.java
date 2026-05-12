/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Wineries;
import com.naissant.naissantapp.Service.WineriesService;
import com.naissant.naissantapp.Repository.WineriesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineriesServiceImp implements WineriesService{
    @Autowired
    private WineriesRepository repository;
    
    @Override
    public List<Wineries> listar() {
        return repository.findAll();
    }

    @Override
    public Wineries listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Wineries add(Wineries w) {
        return repository.save(w);
    }

    @Override
    public Wineries edit(Wineries w) {
        return repository.save(w);
    }
    
    @Override
    public List<Wineries> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Wineries delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
