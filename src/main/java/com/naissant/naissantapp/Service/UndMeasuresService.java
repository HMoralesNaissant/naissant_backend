/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.UndMeasures;
import java.util.List;


public interface UndMeasuresService {
    List<UndMeasures>listar();
    UndMeasures listarId(int id);
    UndMeasures add(UndMeasures u);
    UndMeasures edit(UndMeasures u);
    UndMeasures delete(int id);
    
    List<UndMeasures>listarByIdCompany(int id_company);
}
