/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Reportados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ReportadosRepositorio extends JpaRepository<Reportados, Integer>{
    
    List<Reportados>findByPersonaId_Id(int id_persona);
}
