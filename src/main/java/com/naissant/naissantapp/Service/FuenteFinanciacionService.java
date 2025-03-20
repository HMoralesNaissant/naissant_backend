/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.FuenteFinanciacion;
import java.util.List;


public interface FuenteFinanciacionService {
    List<FuenteFinanciacion>listar();
    FuenteFinanciacion listarId(int id);
    FuenteFinanciacion add(FuenteFinanciacion f);
    FuenteFinanciacion edit(FuenteFinanciacion f);
    FuenteFinanciacion delete(int id);
    
    List<FuenteFinanciacion>listarByIdEmpresa(int id_empresa);
}
