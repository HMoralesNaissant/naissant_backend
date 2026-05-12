/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.RoadAdvisors;
import com.naissant.naissantapp.Service.RoadAdvisorsService;
import com.naissant.naissantapp.Repository.RoadAdvisorsRepository;
import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoadAdvisorsServiceImp implements RoadAdvisorsService{
    @Autowired
    private RoadAdvisorsRepository repository;
    
    @Override
    public List<RoadAdvisors> listar() {
        return repository.findAll();
    }

    @Override
    public RoadAdvisors listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public RoadAdvisors add(RoadAdvisors r) {
        return repository.save(r);
    }

    @Override
    public RoadAdvisors edit(RoadAdvisors r) {
        return repository.save(r);
    }
    
    @Override
    public List<RoadAdvisors> listarByIdAdvisor(int id_advisor) {
        return repository.findByAdvisorId_Id(id_advisor);
    }
    
    @Override
    public List<RoadAdvisors> listarByIdCustomer(int id_customer) {
        return repository.findByCustomerId_Id(id_customer);
    }
    
    /*@Override
    public List<RoadAdvisors> listarByDateVisit(Date dateVisit) {
        return repository.findByDateVisit(dateVisit);
    }*/

    @Override
    public RoadAdvisors delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
