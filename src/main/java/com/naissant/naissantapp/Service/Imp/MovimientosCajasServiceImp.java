/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.MovimientosCajas;
import com.naissant.naissantapp.Repository.MovimientosCajasRepositorio;
import com.naissant.naissantapp.Service.MovimientosCajasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientosCajasServiceImp implements MovimientosCajasService {
    @Autowired
    private MovimientosCajasRepositorio repositorio;
    
    @Override
    public List<MovimientosCajas> listar() {
        return repositorio.findAll();
    }

    @Override
    public MovimientosCajas listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public MovimientosCajas add(MovimientosCajas m) {
        return repositorio.save(m);
    }

    @Override
    public MovimientosCajas edit(MovimientosCajas m) {
        return repositorio.save(m);
    }
    
    @Override
    public List<MovimientosCajas> listarByIdCaja(int id_caja) {
        return repositorio.findByCajaId_Id(id_caja);
    }

    @Override
    public List<MovimientosCajas> listarByIdMedioPago(int id_medio_pago) {
        return repositorio.findByMedioPagoId_Id(id_medio_pago);
    }

    @Override
    public List<MovimientosCajas> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public MovimientosCajas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
