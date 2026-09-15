/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Conveyor;
import com.naissant.naissantapp.Repository.ConveyorRepository;
import com.naissant.naissantapp.Service.ConveyorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConveyorServiceImp implements ConveyorService{
    @Autowired
    private ConveyorRepository repository;
    
    @Override
    public List<Conveyor> listar() {
        return repository.findAll();
    }

    @Override
    public Conveyor listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Conveyor add(Conveyor c) {
        return repository.save(c);
    }

    @Override
    public Conveyor edit(Conveyor c) {
        return repository.save(c);
    }
    
    @Override
    public List<Conveyor> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Conveyor delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
