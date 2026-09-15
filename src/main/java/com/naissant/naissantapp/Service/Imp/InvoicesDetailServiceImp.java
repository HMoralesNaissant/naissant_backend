/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.InvoicesDetail;
import com.naissant.naissantapp.Repository.InvoicesDetailRepository;
import com.naissant.naissantapp.Service.InvoicesDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoicesDetailServiceImp implements InvoicesDetailService{
    @Autowired
    private InvoicesDetailRepository repository;
    
    @Override
    public List<InvoicesDetail> listar() {
        return repository.findAll();
    }

    @Override
    public InvoicesDetail listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public InvoicesDetail add(InvoicesDetail i) {
        return repository.save(i);
    }

    @Override
    public InvoicesDetail edit(InvoicesDetail i) {
        return repository.save(i);
    }
    
    @Override
    public List<InvoicesDetail> listarByIdInvoice(int id_invoice) {
        return repository.findByInvoiceId_Id(id_invoice);
    }

    @Override
    public InvoicesDetail delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
