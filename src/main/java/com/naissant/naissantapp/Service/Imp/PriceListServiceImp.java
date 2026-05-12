/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PriceList;
import com.naissant.naissantapp.Service.PriceListService;
import com.naissant.naissantapp.Repository.PriceListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceListServiceImp implements PriceListService{
    @Autowired
    private PriceListRepository repository;
    
    @Override
    public List<PriceList> listar() {
        return repository.findAll();
    }

    @Override
    public PriceList listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public PriceList add(PriceList p) {
        return repository.save(p);
    }

    @Override
    public PriceList edit(PriceList p) {
        return repository.save(p);
    }
    
    @Override
    public List<PriceList> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public PriceList delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
