/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.repository.CitysRepository;
import com.naissant.naissantapp.entity.Citys;
import com.naissant.naissantapp.service.CitysService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitysServiceImp implements CitysService{
    @Autowired
    private CitysRepository repositorio;
    
    @Override
    public List<Citys> listar() {
        return repositorio.findAll();
    }

    @Override
    public Citys listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Citys add(Citys c) {
        return repositorio.save(c);
    }

    @Override
    public Citys edit(Citys c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<Citys> listarByIdDpts(int id_dpts) {
        return repositorio.findByDptsId_Id(id_dpts);
    }

    @Override
    public Citys delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
