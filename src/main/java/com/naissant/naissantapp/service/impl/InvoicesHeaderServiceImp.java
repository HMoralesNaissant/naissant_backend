/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.entity.InvoicesHeader;
import com.naissant.naissantapp.repository.InvoicesHeaderRepository;
import com.naissant.naissantapp.service.InvoicesHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoicesHeaderServiceImp implements InvoicesHeaderService{
    @Autowired
    private InvoicesHeaderRepository repository;
    
    @Override
    public List<InvoicesHeader> listar() {
        return repository.findAll();
    }

    @Override
    public InvoicesHeader listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public InvoicesHeader add(InvoicesHeader i) {
        return repository.save(i);
    }

    @Override
    public InvoicesHeader edit(InvoicesHeader i) {
        return repository.save(i);
    }
    
    @Override
    public List<InvoicesHeader> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public List<InvoicesHeader> listarByInvoice(Double invoice) {
        return repository.findByInvoice(invoice);
    }

    @Override
    public List<InvoicesHeader> listarByStatus(char status) {
        return repository.findByStatus(status);
    }

    @Override
    public InvoicesHeader delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
