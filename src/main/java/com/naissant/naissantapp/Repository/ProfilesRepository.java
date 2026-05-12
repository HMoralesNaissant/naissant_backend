/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Profiles;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProfilesRepository extends JpaRepository<Profiles, Integer>{
    
    List<Profiles>findByCompanyId_Id(int id_company);
    List<Profiles>findByDescription(String description);
}
