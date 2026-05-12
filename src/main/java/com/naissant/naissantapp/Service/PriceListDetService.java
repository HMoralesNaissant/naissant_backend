/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PriceListDet;
import java.util.List;


public interface PriceListDetService {
    List<PriceListDet>listar();
    PriceListDet listarId(int id);
    PriceListDet add(PriceListDet p);
    PriceListDet edit(PriceListDet p);
    PriceListDet delete(int id);
    
    List<PriceListDet>listarByIdList(int id_list);
    List<PriceListDet>listarByIdCatproducts(int id_catproducts);
    List<PriceListDet>listarByIdProduct(int id_product);
}
