/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ProyectosAprobados;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProyectosAprobadosRepositorio extends JpaRepository<ProyectosAprobados, Integer>{
    
    List<ProyectosAprobados>findByProyectoId_Id(int id_proyecto);
    List<ProyectosAprobados>findByVbBioetico(char vb_bioetico);
    List<ProyectosAprobados>findByVbCientifico(char vb_cientifico);
    List<ProyectosAprobados>findByAcuerdoCientifico(char acuerdo_cientifico);
}
