/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.TipoProgramas;
import java.util.List;


public interface TipoProgramasService {
    List<TipoProgramas>listar();
    TipoProgramas listarId(int id);
    TipoProgramas add(TipoProgramas t);
    TipoProgramas edit(TipoProgramas t);
    TipoProgramas delete(int id);
    
    List<TipoProgramas>listarByIdEmpresa(int id_empresa);
}
