/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Persons;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.PersonsRepository;
import com.naissant.naissantapp.service.PersonsService;

@Service
public class PersonsServiceImp implements PersonsService{
    @Autowired
    private PersonsRepository repository;
    
    @Override
    public List<Persons> listar() {
        return repository.findAll();
    }

    @Override
    public Persons listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Persons add(Persons p) {
        return repository.save(Audit.created(p));
    }

    @Override
    public Persons edit(Persons p) {
        return repository.save(Audit.updated(p));
    }
    
    @Override
    public List<Persons> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }
    
    @Override
    public List<Persons> listarByIdentification(Double identification) {
        return repository.findByIdentification(identification);
    }
    
    @Override
    public List<Persons> listarByIdDepartments(int id_departments) {
        return repository.findByDepartmentsId_Id(id_departments);
    }
    
    @Override
    public List<Persons> listarByIdCity(int id_city) {
        return repository.findByCityId_Id(id_city);
    }
    
    @Override
    public Persons delete(int sid) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
