/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Usuarios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsuariosRepositorio extends JpaRepository<Usuarios, Integer>{
    
    List<Usuarios>findByPersonaId_Id(int id_persona);
    List<Usuarios>findByUsuario(String usuario);
}
