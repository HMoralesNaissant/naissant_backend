/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.RoadAdvisors;
import java.util.List;
import java.util.Date;


public interface RoadAdvisorsService {
    List<RoadAdvisors>listar();
    RoadAdvisors listarId(int id);
    RoadAdvisors add(RoadAdvisors r);
    RoadAdvisors edit(RoadAdvisors r);
    RoadAdvisors delete(int id);
    
    List<RoadAdvisors>listarByIdAdvisor(int id_advisor);
    List<RoadAdvisors>listarByIdCustomer(int id_customer);
    //List<RoadAdvisors>listarByDateVisit(Date dateVisit);
}
