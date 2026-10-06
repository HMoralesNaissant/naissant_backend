/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.PortfolioAge;
import com.naissant.naissantapp.service.PortfolioAgeService;
import com.naissant.naissantapp.repository.PortfolioAgeRepository;
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
        return repository.save(Audit.created(p));
    }

    @Override
    public PortfolioAge edit(PortfolioAge p) {
        return repository.save(Audit.updated(p));
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
