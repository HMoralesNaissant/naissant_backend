/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Branches;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface BranchesRepository extends Repository<Branches, Integer>{
    List<Branches>findAll();
    Branches findById(int id);
    Branches save(Branches b);
    void delete(Branches b);
    
    List<Branches>findByCompanyId_Id(int id_company);
}
