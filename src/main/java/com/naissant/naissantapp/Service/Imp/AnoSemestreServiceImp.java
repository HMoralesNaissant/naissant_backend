/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.AnoSemestreRepositorio;
import com.naissant.naissantapp.Entity.AnoSemestre;
import com.naissant.naissantapp.Service.AnoSemestreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnoSemestreServiceImp implements AnoSemestreService{
    @Autowired
    private AnoSemestreRepositorio repositorio;
    
    @Override
    public List<AnoSemestre> listar() {
        return repositorio.findAll();
    }

    @Override
    public AnoSemestre listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public AnoSemestre add(AnoSemestre a) {
        return repositorio.save(a);
    }

    @Override
    public AnoSemestre edit(AnoSemestre a) {
        return repositorio.save(a);
    }
    
    @Override
    public List<AnoSemestre> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public AnoSemestre delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
