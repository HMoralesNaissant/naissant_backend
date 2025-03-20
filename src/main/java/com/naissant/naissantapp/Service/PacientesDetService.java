/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PacientesDet;

import java.util.List;


public interface PacientesDetService {
    List<PacientesDet>listar();
    PacientesDet listarId(int id);
    PacientesDet add(PacientesDet p);
    PacientesDet edit(PacientesDet p);
    PacientesDet delete(int id);
    
    List<PacientesDet>listarByIdPaciente(int id_paciente);
    List<PacientesDet>listarByIdEstudianteAutorizado(int id_estudiante_autorizado);
    List<PacientesDet>listarByIdConcepto(int id_concepto);
}
