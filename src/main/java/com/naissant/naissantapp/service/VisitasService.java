/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Visitas;
import java.util.List;


public interface VisitasService {
    List<Visitas>listar();
    Visitas listarId(int id);
    Visitas add(Visitas v);
    Visitas edit(Visitas v);
    Visitas delete(int id);
    
    List<Visitas>listarByIdPersona(int id_persona);
    List<Visitas>listarByIdArea(int id_area);
}
