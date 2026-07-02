/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ProceduresActivities;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProceduresActivitiesRepository extends JpaRepository<ProceduresActivities, Integer>{
    
    List<ProceduresActivities>findByCompanyId_Id(int id_company);
    List<ProceduresActivities>findByTypeProcedure(String type_procedure);
}
