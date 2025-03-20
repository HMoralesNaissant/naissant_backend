/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.FacturasDet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface FacturasDetRepositorio extends JpaRepository<FacturasDet, Integer>{
    
    List<FacturasDet>findByFacturaId_Id(int id_factura);
}
