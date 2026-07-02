/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.EntitiesArl;
import java.util.List;


public interface EntitiesArlService {
    List<EntitiesArl>listar();
    EntitiesArl listarId(int id);
    EntitiesArl add(EntitiesArl a);
    EntitiesArl edit(EntitiesArl a);
    EntitiesArl delete(int id);
    
    List<EntitiesArl>listarByIdCompany(int id_company);
}
