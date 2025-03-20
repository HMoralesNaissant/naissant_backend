/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Investigadores;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface InvestigadoresRepositorio extends JpaRepository<Investigadores, Integer>{
    
    List<Investigadores>findByPersonaId_Id(int id_persona);
}
