/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Facturas;
import com.naissant.naissantapp.Repository.FacturasRepositorio;
import com.naissant.naissantapp.Service.FacturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasServiceImp implements FacturasService {
    @Autowired
    private FacturasRepositorio repositorio;
    
    @Override
    public List<Facturas> listar() {
        return repositorio.findAll();
    }

    @Override
    public Facturas listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Facturas add(Facturas f) {
        return repositorio.save(f);
    }

    @Override
    public Facturas edit(Facturas f) {
        return repositorio.save(f);
    }
    
    @Override
    public List<Facturas> listarByNumFactura(Double num_factura) {
        return repositorio.findByNumFactura(num_factura);
    }

    @Override
    public List<Facturas> listarByIdPaciente(int id_paciente) {
        return repositorio.findByPacienteId_Id(id_paciente);
    }

    @Override
    public List<Facturas> listarByIdEstudiante(int id_estudiante) {
        return repositorio.findByEstudianteId_Id(id_estudiante);
    }

    @Override
    public List<Facturas> listarByIdCaja(int id_caja) {
        return repositorio.findByCajaId_Id(id_caja);
    }

    @Override
    public List<Facturas> listarByIdOrdenServicio(int id_orden_servicio) {
        return repositorio.findByOrdenServicioId_Id(id_orden_servicio);
    }

    @Override
    public List<Facturas> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public List<Facturas> listarByIdFormaPago(int id_forma_pago) {
        return repositorio.findByFormaPagoId_Id(id_forma_pago);
    }

    @Override
    public Facturas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
