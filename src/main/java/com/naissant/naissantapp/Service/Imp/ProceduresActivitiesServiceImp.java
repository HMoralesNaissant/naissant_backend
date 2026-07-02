/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ProceduresActivities;
import com.naissant.naissantapp.Service.ProceduresActivitiesService;
import com.naissant.naissantapp.Repository.ProceduresActivitiesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProceduresActivitiesServiceImp implements ProceduresActivitiesService{
    @Autowired
    private ProceduresActivitiesRepository repository;
    
    @Override
    public List<ProceduresActivities> listar() {
        return repository.findAll();
    }

    @Override
    public ProceduresActivities listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public ProceduresActivities add(ProceduresActivities p) {
        return repository.save(p);
    }

    @Override
    public ProceduresActivities edit(ProceduresActivities p) {
        return repository.save(p);
    }
    
    @Override
    public List<ProceduresActivities> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }
    
    @Override
    public List<ProceduresActivities> listarByTypeProcedure(String type_procedure) {
        return repository.findByTypeProcedure(type_procedure);
    }

    @Override
    public ProceduresActivities delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
