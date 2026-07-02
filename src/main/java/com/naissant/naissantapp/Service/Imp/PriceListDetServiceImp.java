/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PriceListDet;
import com.naissant.naissantapp.Service.PriceListDetService;
import com.naissant.naissantapp.Repository.PriceListDetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceListDetServiceImp implements PriceListDetService{
    @Autowired
    private PriceListDetRepository repository;
    
    @Override
    public List<PriceListDet> listar() {
        return repository.findAll();
    }

    @Override
    public PriceListDet listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public PriceListDet add(PriceListDet p) {
        return repository.save(p);
    }

    @Override
    public PriceListDet edit(PriceListDet p) {
        return repository.save(p);
    }
    
    @Override
    public List<PriceListDet> listarByIdList(int id_list) {
        return repository.findByListId_Id(id_list);
    }
    
    @Override
    public List<PriceListDet> listarByIdCatproducts(int id_catproducts) {
        return repository.findByCatproductsId_Id(id_catproducts);
    }
    
    @Override
    public List<PriceListDet> listarByIdProduct(int id_product) {
        return repository.findByProductId_Id(id_product);
    }

    @Override
    public PriceListDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
