/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ProductsDet;
import com.naissant.naissantapp.Service.ProductsDetService;
import com.naissant.naissantapp.Repository.ProductsDetRepository;
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
        return repository.save(p);
    }

    @Override
    public ProductsDet edit(ProductsDet p) {
        return repository.save(p);
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
