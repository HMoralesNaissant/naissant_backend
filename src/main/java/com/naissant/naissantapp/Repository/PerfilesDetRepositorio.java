/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PerfilesDet;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface PerfilesDetRepositorio extends Repository<PerfilesDet, Integer>{
    List<PerfilesDet>findAll();
    PerfilesDet findById(int id);
    PerfilesDet save(PerfilesDet o);
    void delete(PerfilesDet o);
    
    List<PerfilesDet>findByPerfilesId_Id(int id_perfiles);
}
