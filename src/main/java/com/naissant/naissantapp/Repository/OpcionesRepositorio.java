/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Opciones;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface OpcionesRepositorio extends Repository<Opciones, Integer>{
    List<Opciones>findAll();
    Opciones findById(int id);
    Opciones save(Opciones o);
    void delete(Opciones o);
    
    List<Opciones>findByModuloId_Id(int id_modulo);
}
