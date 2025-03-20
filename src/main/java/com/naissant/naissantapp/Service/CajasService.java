/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Cajas;

import java.util.List;


public interface CajasService {
    List<Cajas>listar();
    Cajas listarId(int id);
    Cajas add(Cajas c);
    Cajas edit(Cajas c);
    Cajas delete(int id);
    
    List<Cajas>listarByIdSucursal(int id_sucursal);
}