/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Employees;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface EmployeesRepository extends Repository<Employees, Integer>{
    
    @EntityGraph(attributePaths = {"personId"})
    List<Employees>findAll();
    @EntityGraph(attributePaths = {"personId"})
    Employees findById(int id);
    Employees save(Employees e);
    void delete(Employees e);
    
    @EntityGraph(attributePaths = {"personId"})
    List<Employees>findByPersonId_Id(int id_person);
    @EntityGraph(attributePaths = {"personId"})
    List<Employees>findByTemporaryId_Id(int id_temporary);
}
