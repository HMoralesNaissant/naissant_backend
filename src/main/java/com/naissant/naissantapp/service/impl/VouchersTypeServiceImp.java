/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.VouchersType;
import com.naissant.naissantapp.service.VouchersTypeService;
import com.naissant.naissantapp.repository.VouchersTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VouchersTypeServiceImp implements VouchersTypeService{
    @Autowired
    private VouchersTypeRepository repository;
    
    @Override
    public List<VouchersType> listar() {
        return repository.findAll();
    }

    @Override
    public VouchersType listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public VouchersType add(VouchersType v) {
        return repository.save(Audit.created(v));
    }

    @Override
    public VouchersType edit(VouchersType v) {
        return repository.save(Audit.updated(v));
    }
    
    @Override
    public List<VouchersType> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public VouchersType delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
