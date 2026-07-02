/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.VouchersType;
import com.naissant.naissantapp.Service.VouchersTypeService;
import com.naissant.naissantapp.Repository.VouchersTypeRepository;
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
        return repository.save(v);
    }

    @Override
    public VouchersType edit(VouchersType v) {
        return repository.save(v);
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
