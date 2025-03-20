/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.TipoGastos;
import java.util.List;


public interface TipoGastosService {
    List<TipoGastos>listar();
    TipoGastos listarId(int id);
    TipoGastos add(TipoGastos t);
    TipoGastos edit(TipoGastos t);
    TipoGastos delete(int id);
    
    List<TipoGastos>listarByIdEmpresa(int id_empresa);
}
