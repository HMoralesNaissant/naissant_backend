/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Banks;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface BanksRepository extends Repository<Banks, Integer>{
    
    List<Banks>findAll();
    Banks findById(int id);
    Banks save(Banks b);
    void delete(Banks b);
    
    List<Banks>findByCompanyId_Id(int id_company);
}