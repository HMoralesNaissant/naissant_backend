/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Cargos;
import java.util.List;


public interface CargosService {
    List<Cargos>listar();
    Cargos listarId(int id);
    Cargos add(Cargos c);
    Cargos edit(Cargos c);
    Cargos delete(int id);
    
    List<Cargos>listarByIdAreas(int id_areas);
}
