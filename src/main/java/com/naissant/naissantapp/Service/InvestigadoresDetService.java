/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.InvestigadoresDet;
import java.util.List;


public interface InvestigadoresDetService {
    List<InvestigadoresDet>listar();
    InvestigadoresDet listarId(int id);
    InvestigadoresDet add(InvestigadoresDet i);
    InvestigadoresDet edit(InvestigadoresDet i);
    InvestigadoresDet delete(int id);
    
    List<InvestigadoresDet>listarByIdInvestigador(int id_investigador);
    List<InvestigadoresDet>listarByIdGrupo(int id_grupo);
}
