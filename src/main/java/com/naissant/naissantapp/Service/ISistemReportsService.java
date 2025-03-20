/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.SistemReports;


public interface ISistemReportsService {
    
    SistemReports findByCodigo(String codigo);
    
}
