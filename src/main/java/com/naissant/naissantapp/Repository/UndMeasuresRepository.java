/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.UndMeasures;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UndMeasuresRepository extends JpaRepository<UndMeasures, Integer>{
    
    List<UndMeasures>findByCompanyId_Id(int id_company);
}
