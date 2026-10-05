/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.SistemReports;


public interface ISistemReportsService {
    
    SistemReports findByCodigo(String codigo);
    
}
