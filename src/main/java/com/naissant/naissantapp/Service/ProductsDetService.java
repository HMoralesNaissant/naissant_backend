/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ProductsDet;
import java.util.List;


public interface ProductsDetService {
    List<ProductsDet>listar();
    ProductsDet listarId(int id);
    ProductsDet add(ProductsDet p);
    ProductsDet edit(ProductsDet p);
    ProductsDet delete(int id);
    
    List<ProductsDet>listarByIdProducts(int id_products);
}
