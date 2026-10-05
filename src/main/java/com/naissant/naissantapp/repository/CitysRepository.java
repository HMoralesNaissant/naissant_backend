/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Citys;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CitysRepository extends JpaRepository<Citys, Integer>{

    @Override
    @EntityGraph(attributePaths = {"dptsId"})
    List<Citys> findAll();

    @Override
    @EntityGraph(attributePaths = {"dptsId"})
    Optional<Citys> findById(Integer id);

    
    @EntityGraph(attributePaths = {"dptsId"})
    List<Citys>findByDptsId_Id(int id_dpts);
}
