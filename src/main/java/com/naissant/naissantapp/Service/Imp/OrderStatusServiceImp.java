/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.OrderStatus;
import com.naissant.naissantapp.Service.OrderStatusService;
import com.naissant.naissantapp.Repository.OrderStatusRepository;
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
        return repository.save(o);
    }

    @Override
    public OrderStatus edit(OrderStatus o) {
        return repository.save(o);
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
