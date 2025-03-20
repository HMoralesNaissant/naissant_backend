/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Franquicias;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface FranquiciasRepositorio extends Repository<Franquicias, Integer>{
    List<Franquicias>findAll();
    Franquicias findById(int id);
    Franquicias save(Franquicias f);
    void delete(Franquicias f);
    
    List<Franquicias>findByEmpresaId_Id(int id_empresa);
}
