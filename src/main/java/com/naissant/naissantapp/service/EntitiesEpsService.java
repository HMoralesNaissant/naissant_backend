/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.EntitiesEps;
import java.util.List;


public interface EntitiesEpsService {
    List<EntitiesEps>listar();
    EntitiesEps listarId(int id);
    EntitiesEps add(EntitiesEps p);
    EntitiesEps edit(EntitiesEps p);
    EntitiesEps delete(int id);
    
    List<EntitiesEps>listarByIdCompany(int id_company);
}
