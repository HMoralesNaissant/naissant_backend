/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.ProfilesDet;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ProfilesDetRepository extends Repository<ProfilesDet, Integer>{
    
    @EntityGraph(attributePaths = {"optionsId", "optionsId.moduleId"})
    List<ProfilesDet>findAll();
    @EntityGraph(attributePaths = {"optionsId", "optionsId.moduleId"})
    ProfilesDet findById(int id);
    ProfilesDet save(ProfilesDet p);
    void delete(ProfilesDet p);
    
    @EntityGraph(attributePaths = {"optionsId", "optionsId.moduleId"})
    List<ProfilesDet>findByProfilesId_Id(int id_profiles);
}
