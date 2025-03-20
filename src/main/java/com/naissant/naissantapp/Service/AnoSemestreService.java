/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.AnoSemestre;
import java.util.List;


public interface AnoSemestreService {
    List<AnoSemestre>listar();
    AnoSemestre listarId(int id);
    AnoSemestre add(AnoSemestre a);
    AnoSemestre edit(AnoSemestre a);
    AnoSemestre delete(int id);
    
    List<AnoSemestre>listarByIdEmpresa(int id_empresa);
}
