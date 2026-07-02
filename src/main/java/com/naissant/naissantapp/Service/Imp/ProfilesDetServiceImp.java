/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ProfilesDet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.Repository.ProfilesDetRepository;
import com.naissant.naissantapp.Service.ProfilesDetService;

@Service
public class ProfilesDetServiceImp implements ProfilesDetService{
    @Autowired
    private ProfilesDetRepository repository;
    
    @Override
    public List<ProfilesDet> listar() {
        return repository.findAll();
    }

    @Override
    public ProfilesDet listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public ProfilesDet add(ProfilesDet p) {
        return repository.save(p);
    }

    @Override
    public ProfilesDet edit(ProfilesDet p) {
        return repository.save(p);
    }
    
    @Override
    public List<ProfilesDet> listarByIdProfiles(int id_profiles) {
        return repository.findByProfilesId_Id(id_profiles);
    }

    @Override
    public ProfilesDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}