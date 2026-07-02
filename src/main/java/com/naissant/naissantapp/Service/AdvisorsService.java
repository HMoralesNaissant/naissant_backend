/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Advisors;
import java.util.List;


public interface AdvisorsService {
    List<Advisors>listar();
    Advisors listarId(int id);
    Advisors add(Advisors a);
    Advisors edit(Advisors a);
    Advisors delete(int id);
    
    List<Advisors>listarByIdEmployee(int id_employee);
    List<Advisors>listarByIdZone(int id_zone);
}
