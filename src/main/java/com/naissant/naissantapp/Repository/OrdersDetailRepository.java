/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.OrdersDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface OrdersDetailRepository extends JpaRepository<OrdersDetail, Integer>{
    
    List<OrdersDetail>findByOrderHeaderId_Id(int id_order_header);
    List<OrdersDetail>findByProductId_Id(int id_product);
}
