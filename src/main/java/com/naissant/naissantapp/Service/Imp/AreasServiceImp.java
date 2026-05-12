/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Areas;
import com.naissant.naissantapp.Service.AreasService;
import com.naissant.naissantapp.Repository.AreasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreasServiceImp implements AreasService{
    @Autowired
    private AreasRepository repository;
    
    @Override
    public List<Areas> listar() {
        return repository.findAll();
    }

    @Override
    public Areas listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Areas add(Areas a) {
        return repository.save(a);
    }

    @Override
    public Areas edit(Areas a) {
        return repository.save(a);
    }
    
    @Override
    public List<Areas> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Areas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
