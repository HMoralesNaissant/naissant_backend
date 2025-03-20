/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ConsecutivosPrefijos;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ConsecutivosPrefijosRepositorio extends Repository<ConsecutivosPrefijos, Integer>{
    List<ConsecutivosPrefijos>findAll();
    ConsecutivosPrefijos findById(int id);
    ConsecutivosPrefijos save(ConsecutivosPrefijos c);
    void delete(ConsecutivosPrefijos c);
    
    List<ConsecutivosPrefijos>findBySucursalId_Id(int id_sucursal);
    List<ConsecutivosPrefijos>findByAreaId_Id(int id_area);
}
