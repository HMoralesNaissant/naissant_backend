/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Options;
import java.util.List;


public interface OptionsService {
    List<Options>listar();
    Options listarId(int id);
    Options add(Options o);
    Options edit(Options o);
    Options delete(int id);
    
    List<Options>listarByIdModule(int id_module);
}
