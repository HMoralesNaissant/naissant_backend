/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.FacturasPagos;
import com.naissant.naissantapp.Repository.FacturasPagosRepositorio;
import com.naissant.naissantapp.Service.FacturasPagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasPagosServiceImp implements FacturasPagosService {
    @Autowired
    private FacturasPagosRepositorio repositorio;
    
    @Override
    public List<FacturasPagos> listar() {
        return repositorio.findAll();
    }

    @Override
    public FacturasPagos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public FacturasPagos add(FacturasPagos f) {
        return repositorio.save(f);
    }

    @Override
    public FacturasPagos edit(FacturasPagos f) {
        return repositorio.save(f);
    }
    
    @Override
    public List<FacturasPagos> listarByIdFactura(int id_factura) {
        return repositorio.findByFacturaId_Id(id_factura);
    }

    @Override
    public List<FacturasPagos> listarByIdMedioPago(int id_medio_pago) {
        return repositorio.findByMedioPagoId_Id(id_medio_pago);
    }

    @Override
    public FacturasPagos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
