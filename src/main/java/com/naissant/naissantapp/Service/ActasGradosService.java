/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ActasGrados;
import java.util.List;

public interface ActasGradosService {
    List<ActasGrados>listar();
    ActasGrados listarId(int id);
    ActasGrados add(ActasGrados a);
    ActasGrados edit(ActasGrados a);
    ActasGrados delete(int id);
    
    List<ActasGrados>listarByIdEstudiante(int id_estudiante);
}