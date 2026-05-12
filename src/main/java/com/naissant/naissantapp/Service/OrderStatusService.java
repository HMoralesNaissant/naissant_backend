/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.OrderStatus;
import java.util.List;


public interface OrderStatusService {
    List<OrderStatus>listar();
    OrderStatus listarId(int id);
    OrderStatus add(OrderStatus o);
    OrderStatus edit(OrderStatus o);
    OrderStatus delete(int id);
    
    List<OrderStatus>listarByIdCompany(int id_company);
}
