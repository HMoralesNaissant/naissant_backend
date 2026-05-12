/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Departments;
import java.util.List;


public interface DepartmentsService {
    List<Departments>listar();
    Departments listarId(int id);
    Departments add(Departments d);
    Departments edit(Departments d);
    Departments delete(int id);
    
    List<Departments>listarByIdCountry(int id_country);
}
