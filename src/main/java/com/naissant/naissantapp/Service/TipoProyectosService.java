/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.TipoProyectos;
import java.util.List;


public interface TipoProyectosService {
    List<TipoProyectos>listar();
    TipoProyectos listarId(int id);
    TipoProyectos add(TipoProyectos t);
    TipoProyectos edit(TipoProyectos t);
    TipoProyectos delete(int id);
    
    List<TipoProyectos>listarByIdEmpresa(int id_empresa);
}
