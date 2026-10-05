/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Employees;
import java.util.List;


public interface EmployeesService {
    
    List<Employees>listar();
    Employees listarId(int id);
    Employees add(Employees e);
    Employees edit(Employees e);
    Employees delete(int id);
    
    List<Employees>listarByIdPerson(int id_person);
    List<Employees>listarByIdTemporary(int id_temporary);
}
