/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.MediosPagos;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface MediosPagosRepositorio extends Repository<MediosPagos, Integer>{
    List<MediosPagos>findAll();
    MediosPagos findById(int id);
    MediosPagos save(MediosPagos m);
    void delete(MediosPagos m);
    
    List<MediosPagos>findBySucursalId_Id(int id_sucursal);
}
