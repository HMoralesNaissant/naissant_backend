/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.ProductsDet;
import com.naissant.naissantapp.service.ProductsDetService;
import com.naissant.naissantapp.repository.ProductsDetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsDetServiceImp implements ProductsDetService{
    @Autowired
    private ProductsDetRepository repository;
    
    @Override
    public List<ProductsDet> listar() {
        return repository.findAll();
    }

    @Override
    public ProductsDet listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public ProductsDet add(ProductsDet p) {
        return repository.save(Audit.created(p));
    }

    @Override
    public ProductsDet edit(ProductsDet p) {
        return repository.save(Audit.updated(p));
    }
    
    @Override
    public List<ProductsDet> listarByIdProducts(int id_products) {
        return repository.findByProductsId_Id(id_products);
    }

    @Override
    public ProductsDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
