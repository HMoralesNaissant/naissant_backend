/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.entity.OrdersHeader;
import com.naissant.naissantapp.service.OrdersHeaderService;
import com.naissant.naissantapp.repository.OrdersHeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersHeaderServiceImp implements OrdersHeaderService{
    @Autowired
    private OrdersHeaderRepository repository;
    
    @Override
    public List<OrdersHeader> listar() {
        return repository.findAll();
    }

    @Override
    public OrdersHeader listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public OrdersHeader add(OrdersHeader o) {
        return repository.save(o);
    }

    @Override
    public OrdersHeader edit(OrdersHeader o) {
        return repository.save(o);
    }
    
    @Override
    public List<OrdersHeader> listarByIdAdvisor(int id_advisor) {
        return repository.findByAdvisorId_Id(id_advisor);
    }
    
    @Override
    public List<OrdersHeader> listarByIdWinerie(int id_winerie) {
        return repository.findByWinerieId_Id(id_winerie);
    }
    
    @Override
    public List<OrdersHeader> listarByIdCustomer(int id_customer) {
        return repository.findByCustomerId_Id(id_customer);
    }
    
    @Override
    public List<OrdersHeader> listarByIdOrderStatus(int id_order_status) {
        return repository.findByOrderStatusId_Id(id_order_status);
    }
    
    @Override
    public List<OrdersHeader> listarByIdPaymentForm(int id_payment_form) {
        return repository.findByPaymentFormId_Id(id_payment_form);
    }
    
    @Override
    public OrdersHeader delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
