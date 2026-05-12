/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Profiles;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.Repository.ProfilesRepository;
import com.naissant.naissantapp.Service.ProfilesService;

@Service
public class ProfilesServiceImp implements ProfilesService{
    @Autowired
    private ProfilesRepository repository;
    
    @Override
    public List<Profiles> listar() {
        return repository.findAll();
    }

    @Override
    public Profiles listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Profiles add(Profiles p) {
        return repository.save(p);
    }

    @Override
    public Profiles edit(Profiles p) {
        return repository.save(p);
    }
    
    @Override
    public List<Profiles> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }
    
    @Override
    public List<Profiles> listarByDescription(String description) {
        return repository.findByDescription(description);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
