/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Profiles;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProfilesRepository extends JpaRepository<Profiles, Integer>{

    @Override
    @EntityGraph(attributePaths = {"areasId"})
    List<Profiles> findAll();

    @Override
    @EntityGraph(attributePaths = {"areasId"})
    Optional<Profiles> findById(Integer id);

    
    @EntityGraph(attributePaths = {"areasId"})
    List<Profiles>findByCompanyId_Id(int id_company);
    @EntityGraph(attributePaths = {"areasId"})
    List<Profiles>findByDescription(String description);
}
