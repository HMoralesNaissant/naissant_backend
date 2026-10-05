/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.entity.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.CountryRepository;
import com.naissant.naissantapp.service.CountryService;

@Service
public class CountryServiceImp implements CountryService{
    @Autowired
    private CountryRepository repositorio;
    
    @Override
    public List<Country> listar() {
        return repositorio.findAll();
    }

    @Override
    public Country listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Country add(Country c) {
        return repositorio.save(c);
    }

    @Override
    public Country edit(Country a) {
        return repositorio.save(a);
    }
    
    @Override
    public Country delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
