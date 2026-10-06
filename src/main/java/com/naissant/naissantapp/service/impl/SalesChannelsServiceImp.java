/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.SalesChannels;
import com.naissant.naissantapp.service.SalesChannelsService;
import com.naissant.naissantapp.repository.SalesChannelsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesChannelsServiceImp implements SalesChannelsService{
    @Autowired
    private SalesChannelsRepository repository;
    
    @Override
    public List<SalesChannels> listar() {
        return repository.findAll();
    }

    @Override
    public SalesChannels listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public SalesChannels add(SalesChannels s) {
        return repository.save(Audit.created(s));
    }

    @Override
    public SalesChannels edit(SalesChannels s) {
        return repository.save(Audit.updated(s));
    }
    
    @Override
    public List<SalesChannels> listarByIdList(int id_list) {
        return repository.findByListId_Id(id_list);
    }
    
    @Override
    public List<SalesChannels> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public SalesChannels delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
