/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Disabilities;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface DisabilitiesRepository extends JpaRepository<Disabilities, Integer>{

    @Override
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId"})
    List<Disabilities> findAll();

    @Override
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId"})
    Optional<Disabilities> findById(Integer id);

    
    @EntityGraph(attributePaths = {"employeeId", "employeeId.personId"})
    List<Disabilities>findByEmployeeId_Id(int id_employee);
}