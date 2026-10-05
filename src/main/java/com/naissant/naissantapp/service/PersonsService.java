/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Persons;
import java.util.List;


public interface PersonsService {
    List<Persons>listar();
    Persons listarId(int id);
    Persons add(Persons p);
    Persons edit(Persons p);
    Persons delete(int id);
    
    List<Persons>listarByIdCompany(int id_company);
    List<Persons>listarByIdentification(Double identification);
    List<Persons>listarByIdDepartments(int id_departments);
    List<Persons>listarByIdCity(int id_city);
}
