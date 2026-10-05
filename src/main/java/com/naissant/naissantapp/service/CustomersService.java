/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Customers;
import java.util.List;


public interface CustomersService {
    List<Customers>listar();
    Customers listarId(int id);
    Customers add(Customers c);
    Customers edit(Customers c);
    Customers delete(int id);
    
    List<Customers>listarByIdPerson(int id_person);
    List<Customers>listarByIdZone(int id_zone);
    List<Customers>listarByIdAdvisor(int id_advisor);
    List<Customers>listarByCodeCompany(String company_code);
}
