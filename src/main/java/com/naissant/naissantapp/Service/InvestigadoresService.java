/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Investigadores;
import java.util.List;


public interface InvestigadoresService {
    List<Investigadores>listar();
    Investigadores listarId(int id);
    Investigadores add(Investigadores i);
    Investigadores edit(Investigadores i);
    Investigadores delete(int id);
    
    List<Investigadores>listarByIdPersona(int id_persona);
}
