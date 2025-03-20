/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Franquicias;

import java.util.List;


public interface FranquiciasService {
    List<Franquicias>listar();
    Franquicias listarId(int id);
    Franquicias add(Franquicias f);
    Franquicias edit(Franquicias f);
    Franquicias delete(int id);
    
    List<Franquicias>listarByIdEmpresa(int id_empresa);
}