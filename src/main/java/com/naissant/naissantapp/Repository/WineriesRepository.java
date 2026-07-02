/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Wineries;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface WineriesRepository extends JpaRepository<Wineries, Integer>{
    
    List<Wineries>findByCompanyId_Id(int id_company);
}
