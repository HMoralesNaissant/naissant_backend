/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PriceListDet;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PriceListDetRepository extends JpaRepository<PriceListDet, Integer>{
    
    List<PriceListDet>findByListId_Id(int id_list);
    List<PriceListDet>findByCatproductsId_Id(int id_catproducts);
    List<PriceListDet>findByProductId_Id(int id_product);
}
