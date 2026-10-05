/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.ProceduresActivities;
import java.util.List;


public interface ProceduresActivitiesService {
    List<ProceduresActivities>listar();
    ProceduresActivities listarId(int id);
    ProceduresActivities add(ProceduresActivities p);
    ProceduresActivities edit(ProceduresActivities p);
    ProceduresActivities delete(int id);
    
    List<ProceduresActivities>listarByIdCompany(int id_company);
    List<ProceduresActivities>listarByTypeProcedure(String type_procedure);
}
