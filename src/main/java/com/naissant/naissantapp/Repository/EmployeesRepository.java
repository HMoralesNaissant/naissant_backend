/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Employees;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface EmployeesRepository extends Repository<Employees, Integer>{
    
    List<Employees>findAll();
    Employees findById(int id);
    Employees save(Employees e);
    void delete(Employees e);
    
    List<Employees>findByPersonId_Id(int id_person);
    List<Employees>findByTemporaryId_Id(int id_temporary);
}
