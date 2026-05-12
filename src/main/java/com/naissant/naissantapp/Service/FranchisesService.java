/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;
import com.naissant.naissantapp.Entity.Franchises;
import java.util.List;

public interface FranchisesService {

    List<Franchises>listar();
    Franchises listarId(int id);
    Franchises add(Franchises f);
    Franchises edit(Franchises f);
    Franchises delete(int id);
    
    List<Franchises>listarByIdCompany(int id_company);
}