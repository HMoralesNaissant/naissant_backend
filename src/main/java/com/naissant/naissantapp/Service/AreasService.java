/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Areas;
import java.util.List;


public interface AreasService {
    List<Areas>listar();
    Areas listarId(int id);
    Areas add(Areas e);
    Areas edit(Areas e);
    Areas delete(int id);
    
    List<Areas>listarByIdEmpresa(int id_empresa);
}
