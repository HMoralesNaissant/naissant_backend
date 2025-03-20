/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.SistemReportsRepositorio;
import com.naissant.naissantapp.Entity.SistemReports;
import com.naissant.naissantapp.Service.ISistemReportsService;
import org.springframework.stereotype.Service;

@Service
public class SistemReportsServiceImp extends CommonServiceImpl<SistemReports, Integer, SistemReportsRepositorio>
        implements ISistemReportsService {

    public SistemReportsServiceImp(SistemReportsRepositorio repositorio) {
        super(repositorio);
    }

    @Override
    public SistemReports findByCodigo(String codigo) {
        return this.getRepository().findByCodigo(codigo);
    }
    
    

}
