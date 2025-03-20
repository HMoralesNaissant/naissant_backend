/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ProyectosInvestigador;
import java.util.List;

public interface ProyectosInvestigadorService {
    List<ProyectosInvestigador> listar();
    ProyectosInvestigador listarId(int id);
    ProyectosInvestigador add(ProyectosInvestigador p);
    ProyectosInvestigador edit(ProyectosInvestigador p);
    ProyectosInvestigador delete(int id);

    List<ProyectosInvestigador> listarByIdProyecto(int id_proyecto);
}
