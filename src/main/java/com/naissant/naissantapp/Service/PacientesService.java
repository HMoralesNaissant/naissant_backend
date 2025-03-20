/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Pacientes;

import java.util.List;


public interface PacientesService {
    List<Pacientes>listar();
    Pacientes listarId(int id);
    Pacientes add(Pacientes p);
    Pacientes edit(Pacientes p);
    Pacientes delete(int id);
    
    List<Pacientes>listarByIdPersona(int id_persona);
    List<Pacientes>listarByIdEstudianteInscribe(int id_estudiante_inscribe);
}
