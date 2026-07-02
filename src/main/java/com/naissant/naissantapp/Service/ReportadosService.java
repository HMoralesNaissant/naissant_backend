/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Reportados;

import java.util.List;


public interface ReportadosService {
    List<Reportados>listar();
    Reportados listarId(int id);
    Reportados add(Reportados r);
    Reportados edit(Reportados r);
    Reportados delete(int id);
    
    List<Reportados>listarByIdPersona(int id_persona);
}
