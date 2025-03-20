/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.EstudiantesClinicaOdo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface EstudiantesClinicaOdoRepositorio extends JpaRepository<EstudiantesClinicaOdo, Integer>{
    
    List<EstudiantesClinicaOdo>findByPersonaId_Id(int id_persona);
    List<EstudiantesClinicaOdo>findByProgramaId_Id(int id_programa);
}
