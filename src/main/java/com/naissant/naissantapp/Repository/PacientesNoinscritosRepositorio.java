/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PacientesNoinscritos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface PacientesNoinscritosRepositorio extends JpaRepository<PacientesNoinscritos, Integer>{
    
    List<PacientesNoinscritos>findByPersonaId_Id(int id_persona);
    List<PacientesNoinscritos>findByEstudianteId_Id(int id_estudiante);
}
