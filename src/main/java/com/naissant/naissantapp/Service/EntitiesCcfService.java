/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.EntitiesCcf;
import java.util.List;


public interface EntitiesCcfService {
    List<EntitiesCcf>listar();
    EntitiesCcf listarId(int id);
    EntitiesCcf add(EntitiesCcf c);
    EntitiesCcf edit(EntitiesCcf c);
    EntitiesCcf delete(int id);
    
    List<EntitiesCcf>listarByIdCompany(int id_company);
}
