/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Modulos;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ModulosRepositorio extends Repository<Modulos, Integer>{
    List<Modulos>findAll();
    Modulos findById(int id);
    Modulos save(Modulos m);
    void delete(Modulos m);
    
    List<Modulos>findByEmpresaId_Id(int id_empresa);
}
