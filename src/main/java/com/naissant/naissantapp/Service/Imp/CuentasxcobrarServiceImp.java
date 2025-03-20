/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Cuentasxcobrar;
import com.naissant.naissantapp.Repository.CuentasxcobrarRepositorio;
import com.naissant.naissantapp.Service.CuentasxcobrarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentasxcobrarServiceImp implements CuentasxcobrarService {
    @Autowired
    private CuentasxcobrarRepositorio repositorio;
    
    @Override
    public List<Cuentasxcobrar> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cuentasxcobrar listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Cuentasxcobrar add(Cuentasxcobrar c) {
        return repositorio.save(c);
    }

    @Override
    public Cuentasxcobrar edit(Cuentasxcobrar c) {
        return repositorio.save(c);
    }

    @Override
    public List<Cuentasxcobrar> listarByNumCxc(Double num_cxc) {
        return repositorio.findByNumCxc(num_cxc);
    }
    @Override
    public List<Cuentasxcobrar> listarByIdFactura(int id_factura) {
        return repositorio.findByFacturaId_Id(id_factura);
    }

    @Override
    public List<Cuentasxcobrar> listarByIdEstudiante(int id_estudiante) {
        return repositorio.findByEstudianteId_Id(id_estudiante);
    }

    @Override
    public List<Cuentasxcobrar> listarByIdAnoSemestre(int id_ano_semestre) {
        return repositorio.findByAnoSemestreId_Id(id_ano_semestre);
    }

    @Override
    public Cuentasxcobrar delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
