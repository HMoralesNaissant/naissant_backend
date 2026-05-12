/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.EntitiesTemporary;
import java.util.List;


public interface EntitiesTemporaryService {
    List<EntitiesTemporary>listar();
    EntitiesTemporary listarId(int id);
    EntitiesTemporary add(EntitiesTemporary t);
    EntitiesTemporary edit(EntitiesTemporary t);
    EntitiesTemporary delete(int id);
    
    List<EntitiesTemporary>listarByIdCompany(int id_company);
}
