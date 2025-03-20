/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ProyectosAprobadosObs;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProyectosAprobadosObsRepositorio extends JpaRepository<ProyectosAprobadosObs, Integer>{
    
    List<ProyectosAprobadosObs>findByProyectoAprobId_Id(int id_proyecto_aprob);
}
