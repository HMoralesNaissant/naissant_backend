/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Employees;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.Repository.EmployeesRepository;
import com.naissant.naissantapp.Service.EmployeesService;

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
        return repository.save(e);
    }

    @Override
    public Employees edit(Employees e) {
        return repository.save(e);
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
