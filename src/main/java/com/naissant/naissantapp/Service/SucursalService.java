/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Sucursal;

import java.util.List;


public interface SucursalService {
    List<Sucursal>listar();
    Sucursal listarId(int id);
    Sucursal add(Sucursal s);
    Sucursal edit(Sucursal s);
    Sucursal delete(int id);
    
    List<Sucursal>listarByIdEmpresa(int id_empresa);
}
