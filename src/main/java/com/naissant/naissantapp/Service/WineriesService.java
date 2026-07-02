/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Wineries;
import java.util.List;


public interface WineriesService {
    List<Wineries>listar();
    Wineries listarId(int id);
    Wineries add(Wineries w);
    Wineries edit(Wineries w);
    Wineries delete(int id);
    
    List<Wineries>listarByIdCompany(int id_company);
}
