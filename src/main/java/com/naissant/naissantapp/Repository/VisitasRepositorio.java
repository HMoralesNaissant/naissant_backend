/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Visitas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface VisitasRepositorio extends JpaRepository<Visitas, Integer>{
    
    List<Visitas>findByPersonaId_Id(int id_persona);
    List<Visitas>findByAreaId_Id(int id_area);
}
