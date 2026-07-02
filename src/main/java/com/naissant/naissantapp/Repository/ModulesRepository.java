/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Modules;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ModulesRepository extends Repository<Modules, Integer>{
    List<Modules>findAll();
    Modules findById(int id);
    Modules save(Modules m);
    void delete(Modules m);
    
    List<Modules>findByCompanyId_Id(int id_company);
}
