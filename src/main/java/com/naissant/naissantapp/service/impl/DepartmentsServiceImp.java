/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.repository.DepartmentsRepository;
import com.naissant.naissantapp.entity.Departments;
import com.naissant.naissantapp.service.DepartmentsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentsServiceImp implements DepartmentsService{
    @Autowired
    private DepartmentsRepository repositorio;
    
    @Override
    public List<Departments> listar() {
        return repositorio.findAll();
    }

    @Override
    public Departments listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Departments add(Departments d) {
        return repositorio.save(Audit.created(d));
    }

    @Override
    public Departments edit(Departments d) {
        return repositorio.save(Audit.updated(d));
    }
    
    @Override
    public List<Departments> listarByIdCountry(int id_country) {
        return repositorio.findByCountryId_Id(id_country);
    }

    @Override
    public Departments delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
