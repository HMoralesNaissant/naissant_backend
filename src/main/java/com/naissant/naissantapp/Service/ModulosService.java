/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Modulos;
import java.util.List;


public interface ModulosService {
    List<Modulos>listar();
    Modulos listarId(int id);
    Modulos add(Modulos m);
    Modulos edit(Modulos m);
    Modulos delete(int id);
    
    List<Modulos>listarByIdEmpresa(int id_empresa);
}
