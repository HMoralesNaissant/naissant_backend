/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ProyectosInvestigador;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProyectosInvestigadorRepositorio extends JpaRepository<ProyectosInvestigador, Integer>{
    
    List<ProyectosInvestigador>findByProyectoId_Id(int id_proyecto);
}
