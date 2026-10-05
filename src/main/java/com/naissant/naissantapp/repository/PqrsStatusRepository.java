/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.PqrsStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PqrsStatusRepository extends JpaRepository<PqrsStatus, Integer>{
    
    List<PqrsStatus>findByCompanyId_Id(int id_company);
}
