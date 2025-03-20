/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.EvaluacionInvestigadores;
import java.util.List;


public interface EvaluacionInvestigadoresService {
    List<EvaluacionInvestigadores>listar();
    EvaluacionInvestigadores listarId(int id);
    EvaluacionInvestigadores add(EvaluacionInvestigadores e);
    EvaluacionInvestigadores edit(EvaluacionInvestigadores e);
    EvaluacionInvestigadores delete(int id);
    
    List<EvaluacionInvestigadores>listarByIdEmpresa(int id_empresa);
}
