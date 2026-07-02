/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Areas;
import java.util.List;


public interface AreasService {
    List<Areas>listar();
    Areas listarId(int id);
    Areas add(Areas a);
    Areas edit(Areas a);
    Areas delete(int id);
    
    List<Areas>listarByIdCompany(int id_company);
}
