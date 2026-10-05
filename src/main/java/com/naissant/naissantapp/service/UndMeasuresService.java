/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.UndMeasures;
import java.util.List;


public interface UndMeasuresService {
    List<UndMeasures>listar();
    UndMeasures listarId(int id);
    UndMeasures add(UndMeasures u);
    UndMeasures edit(UndMeasures u);
    UndMeasures delete(int id);
    
    List<UndMeasures>listarByIdCompany(int id_company);
}
