/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Visitantes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface VisitantesRepositorio extends JpaRepository<Visitantes, Integer>{

    List<Visitantes>findByPersonaId_Id(int id_persona);
}
