/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ProfilesDet;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ProfilesDetRepository extends Repository<ProfilesDet, Integer>{
    
    List<ProfilesDet>findAll();
    ProfilesDet findById(int id);
    ProfilesDet save(ProfilesDet p);
    void delete(ProfilesDet p);
    
    List<ProfilesDet>findByProfilesId_Id(int id_profiles);
}
