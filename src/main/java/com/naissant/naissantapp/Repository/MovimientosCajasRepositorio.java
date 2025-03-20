/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.MovimientosCajas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface MovimientosCajasRepositorio extends JpaRepository<MovimientosCajas, Integer>{
    
    List<MovimientosCajas>findByCajaId_Id(int id_caja);
    List<MovimientosCajas>findBySucursalId_Id(int id_sucursal);
    List<MovimientosCajas>findByMedioPagoId_Id(int id_medio_pago);
}
