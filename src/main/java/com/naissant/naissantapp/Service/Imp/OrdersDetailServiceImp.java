/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.OrdersDetail;
import com.naissant.naissantapp.Service.OrdersDetailService;
import com.naissant.naissantapp.Repository.OrdersDetailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersDetailServiceImp implements OrdersDetailService{
    @Autowired
    private OrdersDetailRepository repository;
    
    @Override
    public List<OrdersDetail> listar() {
        return repository.findAll();
    }

    @Override
    public OrdersDetail listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public OrdersDetail add(OrdersDetail o) {
        return repository.save(o);
    }

    @Override
    public OrdersDetail edit(OrdersDetail o) {
        return repository.save(o);
    }
    
    @Override
    public List<OrdersDetail> listarByIdOrderHeader(int id_order_header) {
        return repository.findByOrderHeaderId_Id(id_order_header);
    }
    
    @Override
    public List<OrdersDetail> listarByIdProduct(int id_product) {
        return repository.findByProductId_Id(id_product);
    }
    
    @Override
    public OrdersDetail delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
