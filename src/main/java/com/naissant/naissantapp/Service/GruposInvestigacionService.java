/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.GruposInvestigacion;
import java.util.List;


public interface GruposInvestigacionService {
    List<GruposInvestigacion>listar();
    GruposInvestigacion listarId(int id);
    GruposInvestigacion add(GruposInvestigacion g);
    GruposInvestigacion edit(GruposInvestigacion g);
    GruposInvestigacion delete(int id);
    
    List<GruposInvestigacion>listarByIdEmpresa(int id_empresa);
}
