/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Countrys;
import java.util.List;


public interface CountrysService {
    List<Countrys>listar();
    Countrys listarId(int id);
    Countrys add(Countrys c);
    Countrys edit(Countrys c);
    Countrys delete(int id);
}
