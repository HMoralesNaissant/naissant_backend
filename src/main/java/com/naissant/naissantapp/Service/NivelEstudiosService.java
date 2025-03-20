/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.NivelEstudios;
import java.util.List;


public interface NivelEstudiosService {
    List<NivelEstudios>listar();
    NivelEstudios listarId(int id);
    NivelEstudios add(NivelEstudios c);
    NivelEstudios edit(NivelEstudios c);
    NivelEstudios delete(int id);
    
    List<NivelEstudios>listarByIdEmpresa(int id_empresa);
}
