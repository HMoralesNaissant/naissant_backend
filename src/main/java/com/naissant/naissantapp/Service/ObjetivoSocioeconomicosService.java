/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ObjetivoSocioeconomicos;
import java.util.List;


public interface ObjetivoSocioeconomicosService {
    List<ObjetivoSocioeconomicos>listar();
    ObjetivoSocioeconomicos listarId(int id);
    ObjetivoSocioeconomicos add(ObjetivoSocioeconomicos e);
    ObjetivoSocioeconomicos edit(ObjetivoSocioeconomicos e);
    ObjetivoSocioeconomicos delete(int id);
    
    List<ObjetivoSocioeconomicos>listarByIdEmpresa(int id_empresa);
}
