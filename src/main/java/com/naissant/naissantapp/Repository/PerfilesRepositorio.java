/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Perfiles;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PerfilesRepositorio extends JpaRepository<Perfiles, Integer>{
    
    List<Perfiles>findByEmpresaId_Id(int id_empresa);
    List<Perfiles>findByNombre(String nombre);
}
