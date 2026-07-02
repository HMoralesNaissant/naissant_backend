/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PortfolioAge;
import com.naissant.naissantapp.Service.PortfolioAgeService;
import com.naissant.naissantapp.Repository.PortfolioAgeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioAgeServiceImp implements PortfolioAgeService{
    @Autowired
    private PortfolioAgeRepository repository;
    
    @Override
    public List<PortfolioAge> listar() {
        return repository.findAll();
    }

    @Override
    public PortfolioAge listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public PortfolioAge add(PortfolioAge p) {
        return repository.save(p);
    }

    @Override
    public PortfolioAge edit(PortfolioAge p) {
        return repository.save(p);
    }
    
    @Override
    public List<PortfolioAge> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public PortfolioAge delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
