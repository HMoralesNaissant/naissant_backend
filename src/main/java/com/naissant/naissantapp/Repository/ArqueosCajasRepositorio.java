/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ArqueosCajas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ArqueosCajasRepositorio extends JpaRepository<ArqueosCajas, Integer>{
    
    List<ArqueosCajas>findByCajaId_Id(int id_caja);
    List<ArqueosCajas>findBySucursalId_Id(int id_sucursal);
    List<ArqueosCajas>findByUsuarioId_Id(int id_usuario);
    List<ArqueosCajas>findByNumArqueo(Double num_arqueo);
}
