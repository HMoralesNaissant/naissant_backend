/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.EvidenciasInvestigador;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EvidenciasInvestigadorRepositorio extends JpaRepository<EvidenciasInvestigador, Integer>{
    
    List<EvidenciasInvestigador>findByEvidenciaId_Id(int id_evidencia);
}
