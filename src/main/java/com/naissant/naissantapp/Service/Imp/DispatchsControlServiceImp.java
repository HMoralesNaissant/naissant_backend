/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.DispatchsControl;
import com.naissant.naissantapp.Repository.DispatchsControlRepository;
import com.naissant.naissantapp.Service.DispatchsControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchsControlServiceImp implements DispatchsControlService{
    @Autowired
    private DispatchsControlRepository repository;
    
    @Override
    public List<DispatchsControl> listar() {
        return repository.findAll();
    }

    @Override
    public DispatchsControl listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public DispatchsControl add(DispatchsControl d) {
        return repository.save(d);
    }

    @Override
    public DispatchsControl edit(DispatchsControl d) {
        return repository.save(d);
    }
    
    @Override
    public List<DispatchsControl> listarByIdInvoice(int id_invoice) {
        return repository.findByInvoiceId_Id(id_invoice);
    }

    @Override
    public DispatchsControl delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
