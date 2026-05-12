/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.SalesHours;
import com.naissant.naissantapp.Service.SalesHoursService;
import com.naissant.naissantapp.Repository.SalesHoursRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesHoursServiceImp implements SalesHoursService{
    @Autowired
    private SalesHoursRepository repository;
    
    @Override
    public List<SalesHours> listar() {
        return repository.findAll();
    }

    @Override
    public SalesHours listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public SalesHours add(SalesHours s) {
        return repository.save(s);
    }

    @Override
    public SalesHours edit(SalesHours s) {
        return repository.save(s);
    }
    
    @Override
    public List<SalesHours> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public SalesHours delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
