/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PerfilesDet;
import java.util.List;


public interface PerfilesDetService {
    List<PerfilesDet>listar();
    PerfilesDet listarId(int id);
    PerfilesDet add(PerfilesDet o);
    PerfilesDet edit(PerfilesDet o);
    PerfilesDet delete(int id);
    
    List<PerfilesDet>listarByIdPerfiles(int id_perfiles);
}
