/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Departments;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Integer>{

    @Override
    @EntityGraph(attributePaths = {"countryId"})
    List<Departments> findAll();

    @Override
    @EntityGraph(attributePaths = {"countryId"})
    Optional<Departments> findById(Integer id);

    
    @EntityGraph(attributePaths = {"countryId"})
    List<Departments>findByCountryId_Id(int id_country);
}
