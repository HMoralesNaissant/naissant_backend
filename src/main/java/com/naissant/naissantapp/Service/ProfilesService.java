/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Profiles;
import java.util.List;


public interface ProfilesService {
    List<Profiles>listar();
    Profiles listarId(int id);
    Profiles add(Profiles p);
    Profiles edit(Profiles p);
    void delete(int id);

    List<Profiles>listarByIdCompany(int id_company);
    List<Profiles>listarByDescription(String description);
}
