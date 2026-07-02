/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.EntitiesCcf;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EntitiesCcfRepository extends JpaRepository<EntitiesCcf, Integer>{
    
    List<EntitiesCcf>findByCompanyId_Id(int id_company);
}
