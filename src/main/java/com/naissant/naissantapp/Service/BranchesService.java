/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Branches;
import java.util.List;

public interface BranchesService {
    List<Branches>listar();
    Branches listarId(int id);
    Branches add(Branches b);
    Branches edit(Branches b);
    Branches delete(int id);
    
    List<Branches>listarByIdCompany(int id_company);
}
