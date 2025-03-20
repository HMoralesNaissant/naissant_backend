/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ProgAcademicos;
import java.util.List;


public interface ProgAcademicosService {
    List<ProgAcademicos>listar();
    ProgAcademicos listarId(int id);
    ProgAcademicos add(ProgAcademicos p);
    ProgAcademicos edit(ProgAcademicos p);
    ProgAcademicos delete(int id);
    
    List<ProgAcademicos>listarByIdTipoprograma(int id_tipoprograma);
}
