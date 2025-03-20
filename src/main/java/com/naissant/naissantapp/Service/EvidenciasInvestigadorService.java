/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.EvidenciasInvestigador;
import java.util.List;

public interface EvidenciasInvestigadorService {
    List<EvidenciasInvestigador> listar();
    EvidenciasInvestigador listarId(int id);
    EvidenciasInvestigador add(EvidenciasInvestigador v);
    EvidenciasInvestigador edit(EvidenciasInvestigador v);
    EvidenciasInvestigador delete(int id);

    List<EvidenciasInvestigador> listarByIdEvidencia(int id_evidencia);
}
