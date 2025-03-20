/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.MediosPagos;

import java.util.List;


public interface MediosPagosService {
    List<MediosPagos>listar();
    MediosPagos listarId(int id);
    MediosPagos add(MediosPagos m);
    MediosPagos edit(MediosPagos m);
    MediosPagos delete(int id);
    
    List<MediosPagos>listarByIdSucursal(int id_sucursal);
}
