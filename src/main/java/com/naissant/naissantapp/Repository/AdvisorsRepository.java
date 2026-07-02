/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Advisors;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AdvisorsRepository extends JpaRepository<Advisors, Integer>{
    
    List<Advisors>findByEmployeeId_Id(int id_employee);
    List<Advisors>findByZoneId_Id(int id_zone);
}
