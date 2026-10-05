/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.EconomicActivity;
import java.util.List;


public interface EconomicActivityService {
    
    List<EconomicActivity>listar();
    EconomicActivity listarId(int id);
    EconomicActivity add(EconomicActivity a);
    EconomicActivity edit(EconomicActivity a);
    EconomicActivity delete(int id);
}
