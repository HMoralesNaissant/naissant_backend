/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Modules;
import java.util.List;


public interface ModulesService {
    List<Modules>listar();
    Modules listarId(int id);
    Modules add(Modules m);
    Modules edit(Modules m);
    Modules delete(int id);
    
    List<Modules>listarByIdCompany(int id_company);
}
