/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.TipoProyectos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface TipoProyectosRepositorio extends JpaRepository<TipoProyectos, Integer>{
    
    List<TipoProyectos>findByEmpresaId_Id(int id_empresa);
}
