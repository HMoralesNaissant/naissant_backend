/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Charges;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.Repository.ChargesRepository;
import com.naissant.naissantapp.Service.ChargesService;

@Service
public class ChargesServiceImp implements ChargesService{
    @Autowired
    private ChargesRepository repository;
    
    @Override
    public List<Charges> listar() {
        return repository.findAll();
    }

    @Override
    public Charges listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Charges add(Charges c) {
        return repository.save(c);
    }

    @Override
    public Charges edit(Charges c) {
        return repository.save(c);
    }
    
    @Override
    public List<Charges> listarByIdAreas(int id_areas) {
        return repository.findByAreasId_Id(id_areas);
    }

    @Override
    public Charges delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
