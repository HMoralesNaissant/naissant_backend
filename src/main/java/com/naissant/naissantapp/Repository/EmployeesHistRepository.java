/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.EmployeesHist;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface EmployeesHistRepository extends Repository<EmployeesHist, Integer>{
    
    List<EmployeesHist>findAll();
    EmployeesHist findById(int id);
    EmployeesHist save(EmployeesHist m);
    void delete(EmployeesHist m);
    
    List<EmployeesHist>findByEmployeeId_Id(int id_employee);
}
