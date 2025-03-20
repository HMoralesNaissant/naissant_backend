/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.TipoProductos;
import java.util.List;


public interface TipoProductosService {
    List<TipoProductos>listar();
    TipoProductos listarId(int id);
    TipoProductos add(TipoProductos e);
    TipoProductos edit(TipoProductos e);
    TipoProductos delete(int id);
    
    List<TipoProductos>listarByIdEmpresa(int id_empresa);
}
