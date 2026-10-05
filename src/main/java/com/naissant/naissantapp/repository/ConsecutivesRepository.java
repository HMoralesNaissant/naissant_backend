/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Consecutives;
import org.springframework.data.repository.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;

@org.springframework.stereotype.Repository
public interface ConsecutivesRepository extends Repository<Consecutives, Integer>{
    
    @EntityGraph(attributePaths = {"voucherstypeId"})
    List<Consecutives>findAll();
    @EntityGraph(attributePaths = {"voucherstypeId"})
    Consecutives findById(int id);
    Consecutives save(Consecutives c);
    void delete(Consecutives c);
    
    @EntityGraph(attributePaths = {"voucherstypeId"})
    List<Consecutives>findByCompanyId_Id(int id_company);
    @EntityGraph(attributePaths = {"voucherstypeId"})
    List<Consecutives>findByVoucherstypeId_Id(int id_voucherstype);
}
