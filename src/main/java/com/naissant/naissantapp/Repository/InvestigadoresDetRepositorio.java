/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.InvestigadoresDet;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface InvestigadoresDetRepositorio extends JpaRepository<InvestigadoresDet, Integer>{
    
    List<InvestigadoresDet>findByInvestigadorId_Id(int id_investigador);
    List<InvestigadoresDet>findByGrupoId_Id(int id_grupo);
}
