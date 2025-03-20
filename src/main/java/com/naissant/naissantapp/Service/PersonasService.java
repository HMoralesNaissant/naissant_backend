/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Personas;
import java.util.List;


public interface PersonasService {
    List<Personas>listar();
    Personas listarId(int id);
    Personas add(Personas e);
    Personas edit(Personas e);
    Personas delete(int id);
    
    List<Personas>listarByIdEmpresa(int id_empresa);
    List<Personas>listarByIdentificacion(Double identificacion);
}
