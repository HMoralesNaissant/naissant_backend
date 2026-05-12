/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Consecutives;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ConsecutivesRepository extends Repository<Consecutives, Integer>{
    
    List<Consecutives>findAll();
    Consecutives findById(int id);
    Consecutives save(Consecutives c);
    void delete(Consecutives c);
    
    List<Consecutives>findByCompanyId_Id(int id_company);
    List<Consecutives>findByVoucherstypeId_Id(int id_voucherstype);
}
