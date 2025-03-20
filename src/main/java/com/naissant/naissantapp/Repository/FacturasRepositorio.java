/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface FacturasRepositorio extends JpaRepository<Facturas, Integer>{
    
    List<Facturas>findByNumFactura(Double num_factura);
    List<Facturas>findByPacienteId_Id(int id_paciente);
    List<Facturas>findByEstudianteId_Id(int id_estudiante);
    List<Facturas>findByCajaId_Id(int id_caja);
    List<Facturas>findByOrdenServicioId_Id(int id_orden_servicio);
    List<Facturas>findBySucursalId_Id(int id_sucursal);
    List<Facturas>findByFormaPagoId_Id(int id_forma_pago);
}
