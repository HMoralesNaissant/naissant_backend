/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.EntitiesArl;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EntitiesArlRepository extends JpaRepository<EntitiesArl, Integer>{
    
    List<EntitiesArl>findByCompanyId_Id(int id_company);
}
