/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.OrderStatus;
import com.naissant.naissantapp.service.OrderStatusService;
import com.naissant.naissantapp.repository.OrderStatusRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusServiceImp implements OrderStatusService{
    @Autowired
    private OrderStatusRepository repository;
    
    @Override
    public List<OrderStatus> listar() {
        return repository.findAll();
    }

    @Override
    public OrderStatus listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public OrderStatus add(OrderStatus o) {
        return repository.save(Audit.created(o));
    }

    @Override
    public OrderStatus edit(OrderStatus o) {
        return repository.save(Audit.updated(o));
    }
    
    @Override
    public List<OrderStatus> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public OrderStatus delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
