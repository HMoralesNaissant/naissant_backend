/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Employees;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.EmployeesRepository;
import com.naissant.naissantapp.service.EmployeesService;

@Service
public class EmployeesServiceImp implements EmployeesService{
    @Autowired
    private EmployeesRepository repository;
    
    @Override
    public List<Employees> listar() {
        return repository.findAll();
    }

    @Override
    public Employees listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Employees add(Employees e) {
        return repository.save(Audit.created(e));
    }

    @Override
    public Employees edit(Employees e) {
        return repository.save(Audit.updated(e));
    }
    
    @Override
    public List<Employees> listarByIdPerson(int id_person) {
        return repository.findByPersonId_Id(id_person);
    }
    
    @Override
    public List<Employees> listarByIdTemporary(int id_temporary) {
        return repository.findByTemporaryId_Id(id_temporary);
    }
    
    @Override
    public Employees delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
