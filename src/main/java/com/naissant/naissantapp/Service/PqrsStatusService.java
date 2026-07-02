/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PqrsStatus;
import java.util.List;


public interface PqrsStatusService {
    List<PqrsStatus>listar();
    PqrsStatus listarId(int id);
    PqrsStatus add(PqrsStatus p);
    PqrsStatus edit(PqrsStatus p);
    PqrsStatus delete(int id);
    
    List<PqrsStatus>listarByIdCompany(int id_company);
}
