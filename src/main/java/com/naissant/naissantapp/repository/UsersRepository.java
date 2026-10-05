/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Users;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

    @Override
    @EntityGraph(attributePaths = {"personId", "profileId"})
    List<Users> findAll();

    @Override
    @EntityGraph(attributePaths = {"personId", "profileId"})
    Optional<Users> findById(Integer id);

    
    @EntityGraph(attributePaths = {"personId", "profileId"})
    List<Users>findByPersonId_Id(int id_person);
    @EntityGraph(attributePaths = {"personId", "profileId"})
    List<Users>findByUserName(String user);
}
