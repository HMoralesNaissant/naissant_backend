/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Charges;
import java.util.List;


public interface ChargesService {
    List<Charges>listar();
    Charges listarId(int id);
    Charges add(Charges c);
    Charges edit(Charges c);
    Charges delete(int id);
    
    List<Charges>listarByIdAreas(int id_areas);
}
