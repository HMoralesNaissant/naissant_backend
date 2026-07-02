/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Disabilities;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface DisabilitiesRepository extends JpaRepository<Disabilities, Integer>{
    
    List<Disabilities>findByEmployeeId_Id(int id_employee);
}