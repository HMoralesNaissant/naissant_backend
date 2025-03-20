/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Perfiles;
import java.util.List;


public interface PerfilesService {
    List<Perfiles>listar();
    Perfiles listarId(int id);
    Perfiles add(Perfiles p);
    Perfiles edit(Perfiles p);
    void delete(int id);

    List<Perfiles>listarByIdEmpresa(int id_empresa);
    List<Perfiles>listarByNombre(String nombre);
}
