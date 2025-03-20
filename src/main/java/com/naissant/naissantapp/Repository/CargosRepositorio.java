/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Cargos;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface CargosRepositorio extends Repository<Cargos, Integer>{
    List<Cargos>findAll();
    Cargos findById(int id);
    Cargos save(Cargos c);
    void delete(Cargos c);
    
    List<Cargos>findByAreasId_Id(int id_areas);
}
