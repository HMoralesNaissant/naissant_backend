/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.EntitiesEps;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EntitiesEpsRepository extends JpaRepository<EntitiesEps, Integer>{
    
    List<EntitiesEps>findByCompanyId_Id(int id_company);
}
