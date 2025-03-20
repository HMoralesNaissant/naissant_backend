/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.CargosInvestigadores;
import java.util.List;


public interface CargosInvestigadoresService {
    List<CargosInvestigadores>listar();
    CargosInvestigadores listarId(int id);
    CargosInvestigadores add(CargosInvestigadores c);
    CargosInvestigadores edit(CargosInvestigadores c);
    CargosInvestigadores delete(int id);
    
    List<CargosInvestigadores>listarByIdEmpresa(int id_empresa);
}
