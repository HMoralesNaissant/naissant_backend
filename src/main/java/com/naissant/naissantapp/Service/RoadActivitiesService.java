/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.RoadActivities;
import java.util.List;
import java.util.Date;


public interface RoadActivitiesService {
    List<RoadActivities>listar();
    RoadActivities listarId(int id);
    RoadActivities add(RoadActivities r);
    RoadActivities edit(RoadActivities r);
    RoadActivities delete(int id);
    
    List<RoadActivities>listarByIdRoadAdvisor(int id_road_advisor);
    List<RoadActivities>listarByIdProcedureActivity(int id_procedure_activity);
    //List<RoadActivities>listarByDateActivity(Date dateActivity);
}
