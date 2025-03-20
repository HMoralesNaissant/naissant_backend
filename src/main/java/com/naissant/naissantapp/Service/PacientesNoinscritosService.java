/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PacientesNoinscritos;

import java.util.List;


public interface PacientesNoinscritosService {
    List<PacientesNoinscritos>listar();
    PacientesNoinscritos listarId(int id);
    PacientesNoinscritos add(PacientesNoinscritos p);
    PacientesNoinscritos edit(PacientesNoinscritos p);
    PacientesNoinscritos delete(int id);
    
    List<PacientesNoinscritos>listarByIdPersona(int id_persona);
    List<PacientesNoinscritos>listarByIdEstudiante(int id_estudiante);
}
