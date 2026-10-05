/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.repository.SistemReportsRepositorio;
import com.naissant.naissantapp.entity.SistemReports;
import com.naissant.naissantapp.service.ISistemReportsService;
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
