/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Opciones;
import java.util.List;


public interface OpcionesService {
    List<Opciones>listar();
    Opciones listarId(int id);
    Opciones add(Opciones o);
    Opciones edit(Opciones o);
    Opciones delete(int id);
    
    List<Opciones>listarByIdModulo(int id_modulo);
}
