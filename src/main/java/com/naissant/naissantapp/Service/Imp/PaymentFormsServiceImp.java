/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PaymentForms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.naissant.naissantapp.Repository.PaymentFormsRepository;
import com.naissant.naissantapp.Service.PaymentFormsService;

@Service
public class PaymentFormsServiceImp implements PaymentFormsService {
    @Autowired
    private PaymentFormsRepository repository;
    
    @Override
    public List<PaymentForms> listar() {
        return repository.findAll();
    }

    @Override
    public PaymentForms listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public PaymentForms add(PaymentForms f) {
        return repository.save(f);
    }

    @Override
    public PaymentForms edit(PaymentForms f) {
        return repository.save(f);
    }
    
    @Override
    public List<PaymentForms> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public PaymentForms delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
