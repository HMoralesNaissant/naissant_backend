/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.SeveranceFund;
import com.naissant.naissantapp.Service.SeveranceFundService;
import com.naissant.naissantapp.Repository.SeveranceFundRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeveranceFundServiceImp implements SeveranceFundService{
    @Autowired
    private SeveranceFundRepository repository;
    
    @Override
    public List<SeveranceFund> listar() {
        return repository.findAll();
    }

    @Override
    public SeveranceFund listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public SeveranceFund add(SeveranceFund s) {
        return repository.save(s);
    }

    @Override
    public SeveranceFund edit(SeveranceFund s) {
        return repository.save(s);
    }
    
    @Override
    public List<SeveranceFund> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public SeveranceFund delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
