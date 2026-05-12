/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ProfilesDet;
import java.util.List;


public interface ProfilesDetService {
    
    List<ProfilesDet>listar();
    ProfilesDet listarId(int id);
    ProfilesDet add(ProfilesDet p);
    ProfilesDet edit(ProfilesDet p);
    ProfilesDet delete(int id);
    
    List<ProfilesDet>listarByIdProfiles(int id_profiles);
}
