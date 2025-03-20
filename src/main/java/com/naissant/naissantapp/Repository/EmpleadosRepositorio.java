/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Empleados;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface EmpleadosRepositorio extends Repository<Empleados, Integer>{
    List<Empleados>findAll();
    Empleados findById(int id);
    Empleados save(Empleados e);
    void delete(Empleados e);
    
    List<Empleados>findByPersonaId_Id(int id_persona);
}
