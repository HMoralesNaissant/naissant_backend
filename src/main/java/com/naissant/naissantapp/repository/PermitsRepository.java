/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Permits;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PermitsRepository extends JpaRepository<Permits, Integer>{

    @Override
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId"})
    List<Permits> findAll();

    @Override
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId"})
    Optional<Permits> findById(Integer id);

    
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId"})
    List<Permits>findByEmployeeId_Id(int id_employee);
}