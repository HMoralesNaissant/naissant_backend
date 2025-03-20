/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Evidencias;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EvidenciasRepositorio extends JpaRepository<Evidencias, Integer>{
    
    List<Evidencias>findByProyectoId_Id(int id_proyecto);
    List<Evidencias>findByGrupoInvestigacionId_Id(int id_grupo_investigacion);
}
