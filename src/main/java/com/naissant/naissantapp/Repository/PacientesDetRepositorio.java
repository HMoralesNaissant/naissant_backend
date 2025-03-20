/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PacientesDet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface PacientesDetRepositorio extends JpaRepository<PacientesDet, Integer>{
    
    List<PacientesDet>findByPacienteId_Id(int id_paciente);
    List<PacientesDet>findByEstudianteAutorizadoId_Id(int id_estudiante_autorizado);
    List<PacientesDet>findByConceptoId_Id(int id_concepto);
}
