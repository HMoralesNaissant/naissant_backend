/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.OrdersDetail;
import java.util.List;


public interface OrdersDetailService {
    List<OrdersDetail>listar();
    OrdersDetail listarId(int id);
    OrdersDetail add(OrdersDetail o);
    OrdersDetail edit(OrdersDetail o);
    OrdersDetail delete(int id);
    
    List<OrdersDetail>listarByIdOrderHeader(int id_order_header);
    List<OrdersDetail>listarByIdProduct(int id_product);
}
