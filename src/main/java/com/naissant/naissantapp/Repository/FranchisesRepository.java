/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Franchises;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface FranchisesRepository extends Repository<Franchises, Integer>{
    
    List<Franchises>findAll();
    Franchises findById(int id);
    Franchises save(Franchises f);
    void delete(Franchises f);
    
    List<Franchises>findByCompanyId_Id(int id_company);
}
