/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Conveyor;
import java.util.List;


public interface ConveyorService {
    List<Conveyor>listar();
    Conveyor listarId(int id);
    Conveyor add(Conveyor c);
    Conveyor edit(Conveyor c);
    Conveyor delete(int id);
    
    List<Conveyor>listarByIdCompany(int id_company);
}
