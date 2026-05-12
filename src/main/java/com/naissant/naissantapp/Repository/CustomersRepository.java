/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Customers;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{
    
    List<Customers>findByPersonId_Id(int id_person);
    List<Customers>findByZoneId_Id(int id_zone);
    List<Customers>findByAdvisorId_Id(int id_advisor);
}
