/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Proyectos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProyectosRepositorio extends JpaRepository<Proyectos, Integer>{
    
    List<Proyectos>findByEmpresaId_Id(int id_empresa);
    List<Proyectos>findByGrupoInvestigacionId_Id(int id_grupo_investigacion);
}
