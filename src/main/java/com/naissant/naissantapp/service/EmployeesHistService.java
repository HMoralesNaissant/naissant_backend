/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.EmployeesHist;
import java.util.List;


public interface EmployeesHistService {
    
    List<EmployeesHist>listar();
    EmployeesHist listarId(int id);
    EmployeesHist add(EmployeesHist m);
    EmployeesHist edit(EmployeesHist m);
    EmployeesHist delete(int id);
    
    List<EmployeesHist>listarByIdEmployee(int id_employee);
}
