/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Charges;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ChargesRepository extends Repository<Charges, Integer>{
    @EntityGraph(attributePaths = {"areasId"})
    List<Charges>findAll();
    @EntityGraph(attributePaths = {"areasId"})
    Charges findById(int id);
    Charges save(Charges c);
    void delete(Charges c);
    
    @EntityGraph(attributePaths = {"areasId"})
    List<Charges>findByAreasId_Id(int id_areas);
}
