/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.RoadActivities;
import java.util.List;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RoadActivitiesRepository extends JpaRepository<RoadActivities, Integer>{
    
    List<RoadActivities>findByRoadAdvisorId_Id(int id_road_advisor);
    List<RoadActivities>findByProcedureActivityId_Id(int id_procedure_activity);
    //List<RoadActivities>findByDateActivity(Date dateActivity);
}
