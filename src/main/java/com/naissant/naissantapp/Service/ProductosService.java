/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Productos;
import java.util.List;


public interface ProductosService {
    List<Productos>listar();
    Productos listarId(int id);
    Productos add(Productos p);
    Productos edit(Productos p);
    Productos delete(int id);
    
    List<Productos>listarByIdTipo(int id_tipo);
}
