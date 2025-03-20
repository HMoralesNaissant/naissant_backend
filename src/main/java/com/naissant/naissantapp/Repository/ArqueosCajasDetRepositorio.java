/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ArqueosCajasDet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ArqueosCajasDetRepositorio extends JpaRepository<ArqueosCajasDet, Integer>{
    
    List<ArqueosCajasDet>findByArqueoCajaId_Id(int id_arqueo_caja);
    List<ArqueosCajasDet>findByMedioPagoId_Id(int id_medio_pago);
}
