/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.RoadAdvisors;
import java.util.List;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RoadAdvisorsRepository extends JpaRepository<RoadAdvisors, Integer>{
    
    List<RoadAdvisors>findByAdvisorId_Id(int id_advisor);
    List<RoadAdvisors>findByCustomerId_Id(int id_customer);
    //List<RoadAdvisors>findByDateVisit(Date dateVisit);
}
