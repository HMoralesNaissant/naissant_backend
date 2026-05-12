/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.CatProducts;
import com.naissant.naissantapp.Service.CatProductsService;
import com.naissant.naissantapp.Repository.CatProductsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatProductsServiceImp implements CatProductsService{
    @Autowired
    private CatProductsRepository repository;
    
    @Override
    public List<CatProducts> listar() {
        return repository.findAll();
    }

    @Override
    public CatProducts listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public CatProducts add(CatProducts p) {
        return repository.save(p);
    }

    @Override
    public CatProducts edit(CatProducts p) {
        return repository.save(p);
    }
    
    @Override
    public List<CatProducts> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public CatProducts delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
