/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Citys;
import java.util.List;


public interface CitysService {
    List<Citys>listar();
    Citys listarId(int id);
    Citys add(Citys e);
    Citys edit(Citys e);
    Citys delete(int id);
    
    List<Citys>listarByIdDpts(int id_dpts);
}