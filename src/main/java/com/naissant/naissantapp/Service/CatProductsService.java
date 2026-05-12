/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.CatProducts;
import java.util.List;


public interface CatProductsService {
    List<CatProducts>listar();
    CatProducts listarId(int id);
    CatProducts add(CatProducts p);
    CatProducts edit(CatProducts p);
    CatProducts delete(int id);
    
    List<CatProducts>listarByIdCompany(int id_company);
}
