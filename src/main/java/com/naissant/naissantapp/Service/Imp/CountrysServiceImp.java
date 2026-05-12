/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.CountrysRepository;
import com.naissant.naissantapp.Entity.Countrys;
import com.naissant.naissantapp.Service.CountrysService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountrysServiceImp implements CountrysService{
    @Autowired
    private CountrysRepository repositorio;
    
    @Override
    public List<Countrys> listar() {
        return repositorio.findAll();
    }

    @Override
    public Countrys listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Countrys add(Countrys c) {
        return repositorio.save(c);
    }

    @Override
    public Countrys edit(Countrys a) {
        return repositorio.save(a);
    }
    
    @Override
    public Countrys delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
