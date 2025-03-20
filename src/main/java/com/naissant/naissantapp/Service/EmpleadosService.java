/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Empleados;
import java.util.List;


public interface EmpleadosService {
    List<Empleados>listar();
    Empleados listarId(int id);
    Empleados add(Empleados e);
    Empleados edit(Empleados e);
    Empleados delete(int id);
    
    List<Empleados>listarByIdPersona(int id_persona);
    
}
