/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Areas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AreasRepository extends JpaRepository<Areas, Integer>{
    
    List<Areas>findByCompanyId_Id(int id_company);
}
