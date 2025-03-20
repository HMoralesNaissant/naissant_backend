/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Personas;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface PersonasRepositorio extends Repository<Personas, Integer>{
    List<Personas>findAll();
    Personas findById(int id);
    Personas save(Personas p);
    void delete(Personas p);
    
    List<Personas>findByEmpresaId_Id(int id_empresa);
    List<Personas>findByIdentificacion(Double identificacion);
}
