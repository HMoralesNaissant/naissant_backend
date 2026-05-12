/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Consecutives;
import java.util.List;


public interface ConsecutivesService {
    
    List<Consecutives>listar();
    Consecutives listarId(int id);
    Consecutives add(Consecutives c);
    Consecutives edit(Consecutives c);
    Consecutives delete(int id);
    
    List<Consecutives>listarByIdCompany(int id_company);
    List<Consecutives>listarByIdVoucherstype(int id_voucherstype);
}
