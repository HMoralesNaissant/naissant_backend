/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Products;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
    
    List<Products>findByCatProductsId_Id(int id_cat_products);
    List<Products>findByPresentationId_Id(int id_presentation);
    /*List<Products>findByBarCode(String bar_code);*/
}
