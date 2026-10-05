/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CarrierRepository extends JpaRepository<Carrier, Integer>{
    
    List<Carrier>findByCompanyId_Id(int id_company);
}
