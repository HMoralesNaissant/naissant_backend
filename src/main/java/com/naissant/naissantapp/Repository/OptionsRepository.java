/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Options;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface OptionsRepository extends Repository<Options, Integer>{
    List<Options>findAll();
    Options findById(int id);
    Options save(Options o);
    void delete(Options o);
    
    List<Options>findByModuleId_Id(int id_module);
}
