/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ArqueosCajasDet;
import com.naissant.naissantapp.Repository.ArqueosCajasDetRepositorio;
import com.naissant.naissantapp.Service.ArqueosCajasDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArqueosCajasDetServiceImp implements ArqueosCajasDetService {
    @Autowired
    private ArqueosCajasDetRepositorio repositorio;
    
    @Override
    public List<ArqueosCajasDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public ArqueosCajasDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ArqueosCajasDet add(ArqueosCajasDet a) {
        return repositorio.save(a);
    }

    @Override
    public ArqueosCajasDet edit(ArqueosCajasDet a) {
        return repositorio.save(a);
    }
    
    @Override
    public List<ArqueosCajasDet> listarByIdArqueoCaja(int id_arqueo_caja) {
        return repositorio.findByArqueoCajaId_Id(id_arqueo_caja);
    }

    @Override
    public List<ArqueosCajasDet> listarByIdMedioPago(int id_medio_pago) {
        return repositorio.findByMedioPagoId_Id(id_medio_pago);
    }

    @Override
    public ArqueosCajasDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
