/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.SeveranceFund;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface SeveranceFundRepository extends JpaRepository<SeveranceFund, Integer>{
    
    List<SeveranceFund>findByCompanyId_Id(int id_company);
}
