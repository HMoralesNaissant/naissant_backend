/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PensionFund;
import com.naissant.naissantapp.Service.PensionFundService;
import com.naissant.naissantapp.Repository.PensionFundRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PensionFundServiceImp implements PensionFundService{
    @Autowired
    private PensionFundRepository repository;
    
    @Override
    public List<PensionFund> listar() {
        return repository.findAll();
    }

    @Override
    public PensionFund listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public PensionFund add(PensionFund p) {
        return repository.save(p);
    }

    @Override
    public PensionFund edit(PensionFund p) {
        return repository.save(p);
    }
    
    @Override
    public List<PensionFund> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public PensionFund delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
