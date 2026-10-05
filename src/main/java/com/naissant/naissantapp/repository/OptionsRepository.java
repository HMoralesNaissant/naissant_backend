/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Options;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface OptionsRepository extends Repository<Options, Integer>{
    @EntityGraph(attributePaths = {"moduleId"})
    List<Options>findAll();
    @EntityGraph(attributePaths = {"moduleId"})
    Options findById(int id);
    Options save(Options o);
    void delete(Options o);
    
    @EntityGraph(attributePaths = {"moduleId"})
    List<Options>findByModuleId_Id(int id_module);
}
