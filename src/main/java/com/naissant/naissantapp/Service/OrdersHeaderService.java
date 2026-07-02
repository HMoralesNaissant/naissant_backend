/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.OrdersHeader;
import java.util.List;


public interface OrdersHeaderService {
    List<OrdersHeader>listar();
    OrdersHeader listarId(int id);
    OrdersHeader add(OrdersHeader o);
    OrdersHeader edit(OrdersHeader o);
    OrdersHeader delete(int id);
    
    List<OrdersHeader>listarByIdAdvisor(int id_advisor);
    List<OrdersHeader>listarByIdWinerie(int id_winerie);
    List<OrdersHeader>listarByIdCustomer(int id_customer);
    List<OrdersHeader>listarByIdOrderStatus(int id_order_status);
    List<OrdersHeader>listarByIdPaymentForm(int id_payment_form);
}
