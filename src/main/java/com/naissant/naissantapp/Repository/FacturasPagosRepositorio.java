/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.FacturasPagos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface FacturasPagosRepositorio extends JpaRepository<FacturasPagos, Integer>{
    
    List<FacturasPagos>findByFacturaId_Id(int id_factura);
    List<FacturasPagos>findByMedioPagoId_Id(int id_medio_pago);
}
