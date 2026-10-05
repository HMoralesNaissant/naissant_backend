/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Wineries;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface WineriesRepository extends JpaRepository<Wineries, Integer>{

    @Override
    @EntityGraph(attributePaths = {"cityId"})
    List<Wineries> findAll();

    @Override
    @EntityGraph(attributePaths = {"cityId"})
    Optional<Wineries> findById(Integer id);

    
    @EntityGraph(attributePaths = {"cityId"})
    List<Wineries>findByCompanyId_Id(int id_company);
    @EntityGraph(attributePaths = {"cityId"})
    List<Wineries>findByCityId_Id(int id_city);
}
