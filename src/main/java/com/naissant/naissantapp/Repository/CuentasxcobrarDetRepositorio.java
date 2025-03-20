/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.CuentasxcobrarDet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CuentasxcobrarDetRepositorio extends JpaRepository<CuentasxcobrarDet, Integer>{

    List<CuentasxcobrarDet>findByFacturaId_Id(int id_factura);
    List<CuentasxcobrarDet>findByCuentasxcobrarId_Id(int id_cuentasxcobrar);
}
