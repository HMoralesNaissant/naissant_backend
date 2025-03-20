/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface PacientesRepositorio extends JpaRepository<Pacientes, Integer>{
    
    List<Pacientes>findByPersonaId_Id(int id_persona);
    List<Pacientes>findByEstudianteInscribeId_Id(int id_estudiante_inscribe);
}
