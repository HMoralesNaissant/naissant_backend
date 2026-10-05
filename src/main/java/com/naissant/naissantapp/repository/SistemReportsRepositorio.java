/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.SistemReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SistemReportsRepositorio extends JpaRepository<SistemReports, Integer>{
    
    SistemReports findByCodigo(String codigo);
    
}
