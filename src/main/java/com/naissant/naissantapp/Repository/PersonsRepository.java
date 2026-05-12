/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Persons;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface PersonsRepository extends Repository<Persons, Integer>{
    
    List<Persons>findAll();
    Persons findById(int id);
    Persons save(Persons p);
    void delete(Persons p);
    
    List<Persons>findByCompanyId_Id(int id_company);
    List<Persons>findByIdentification(Double identification);
    List<Persons>findByDepartmentsId_Id(int id_departments);
    List<Persons>findByCityId_Id(int id_city);
}
