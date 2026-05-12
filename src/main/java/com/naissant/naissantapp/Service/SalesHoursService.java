/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.SalesHours;
import java.util.List;


public interface SalesHoursService {
    List<SalesHours>listar();
    SalesHours listarId(int id);
    SalesHours add(SalesHours s);
    SalesHours edit(SalesHours s);
    SalesHours delete(int id);
    
    List<SalesHours>listarByIdCompany(int id_company);
}
