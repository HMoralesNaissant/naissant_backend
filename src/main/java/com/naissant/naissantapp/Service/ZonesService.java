/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Zones;
import java.util.List;


public interface ZonesService {
    List<Zones>listar();
    Zones listarId(int id);
    Zones add(Zones z);
    Zones edit(Zones z);
    Zones delete(int id);
    
    List<Zones>listarByIdCompany(int id_company);
}
