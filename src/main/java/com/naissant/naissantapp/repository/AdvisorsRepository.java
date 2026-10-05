/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Advisors;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AdvisorsRepository extends JpaRepository<Advisors, Integer>{

    @Override
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId", "zoneId"})
    List<Advisors> findAll();

    @Override
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId", "zoneId"})
    Optional<Advisors> findById(Integer id);

    
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId", "zoneId"})
    List<Advisors>findByEmployeeId_Id(int id_employee);
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId", "zoneId"})
    List<Advisors>findByZoneId_Id(int id_zone);
}
