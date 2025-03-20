/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Estudiantes;
import java.util.List;


public interface EstudiantesService {
    List<Estudiantes>listar();
    Estudiantes listarId(int id);
    Estudiantes add(Estudiantes e);
    Estudiantes edit(Estudiantes e);
    Estudiantes delete(int id);
    
    List<Estudiantes>listarByIdPersona(int id_persona);
    List<Estudiantes>listarByIdPrograma(int id_programa);
    List<Estudiantes>listarBySalutem(String salutem);
}
