/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Customers;
import com.naissant.naissantapp.Service.CustomersService;
import com.naissant.naissantapp.Repository.CustomersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersServiceImp implements CustomersService{
    @Autowired
    private CustomersRepository repository;
    
    @Override
    public List<Customers> listar() {
        return repository.findAll();
    }

    @Override
    public Customers listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Customers add(Customers c) {
        return repository.save(c);
    }

    @Override
    public Customers edit(Customers c) {
        return repository.save(c);
    }
    
    @Override
    public List<Customers> listarByIdPerson(int id_person) {
        return repository.findByPersonId_Id(id_person);
    }
    
    @Override
    public List<Customers> listarByIdZone(int id_zone) {
        return repository.findByZoneId_Id(id_zone);
    }
    
    @Override
    public List<Customers> listarByIdAdvisor(int id_advisor) {
        return repository.findByAdvisorId_Id(id_advisor);
    }

    @Override
    public Customers delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
