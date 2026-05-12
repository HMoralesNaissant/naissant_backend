/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Advisors;
import com.naissant.naissantapp.Service.AdvisorsService;
import com.naissant.naissantapp.Repository.AdvisorsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvisorsServiceImp implements AdvisorsService{
    @Autowired
    private AdvisorsRepository repository;
    
    @Override
    public List<Advisors> listar() {
        return repository.findAll();
    }

    @Override
    public Advisors listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Advisors add(Advisors a) {
        return repository.save(a);
    }

    @Override
    public Advisors edit(Advisors a) {
        return repository.save(a);
    }
    
    @Override
    public List<Advisors> listarByIdEmployee(int id_employee) {
        return repository.findByEmployeeId_Id(id_employee);
    }
    
    @Override
    public List<Advisors> listarByIdZone(int id_zone) {
        return repository.findByZoneId_Id(id_zone);
    }

    @Override
    public Advisors delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
