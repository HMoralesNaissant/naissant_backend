/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.RoadActivities;
import com.naissant.naissantapp.Service.RoadActivitiesService;
import com.naissant.naissantapp.Repository.RoadActivitiesRepository;
import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoadActivitiesServiceImp implements RoadActivitiesService{
    @Autowired
    private RoadActivitiesRepository repository;
    
    @Override
    public List<RoadActivities> listar() {
        return repository.findAll();
    }

    @Override
    public RoadActivities listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public RoadActivities add(RoadActivities r) {
        return repository.save(r);
    }

    @Override
    public RoadActivities edit(RoadActivities r) {
        return repository.save(r);
    }
    
    @Override
    public List<RoadActivities> listarByIdRoadAdvisor(int id_road_advisor) {
        return repository.findByRoadAdvisorId_Id(id_road_advisor);
    }
    
    @Override
    public List<RoadActivities> listarByIdProcedureActivity(int id_procedure_activity) {
        return repository.findByProcedureActivityId_Id(id_procedure_activity);
    }
    
    /*@Override
    public List<RoadActivities> listarByDateActivity(Date dateActivity) {
        return repository.findByDateActivity(dateActivity);
    }*/

    @Override
    public RoadActivities delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
