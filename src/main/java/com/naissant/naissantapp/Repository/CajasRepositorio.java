/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Cajas;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CajasRepositorio extends Repository<Cajas, Integer>{
    List<Cajas>findAll();
    Cajas findById(int id);
    Cajas save(Cajas c);
    void delete(Cajas c);
    
    List<Cajas>findBySucursalId_Id(int id_sucursal);
}
