/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.EmployeesHist;
import com.naissant.naissantapp.repository.EmployeesHistRepository;
import com.naissant.naissantapp.service.EmployeesHistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesHistServiceImp implements EmployeesHistService{
    @Autowired
    private EmployeesHistRepository repository;
    
    @Override
    public List<EmployeesHist> listar() {
        return repository.findAll();
    }

    @Override
    public EmployeesHist listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public EmployeesHist add(EmployeesHist m) {
        return repository.save(Audit.created(m));
    }

    @Override
    public EmployeesHist edit(EmployeesHist m) {
        return repository.save(Audit.updated(m));
    }
    
    @Override
    public List<EmployeesHist> listarByIdEmployee(int id_employee) {
        return repository.findByEmployeeId_Id(id_employee);
    }
    
    @Override
    public EmployeesHist delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
