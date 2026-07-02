/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.OrdersHeader;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface OrdersHeaderRepository extends JpaRepository<OrdersHeader, Integer>{
    
    List<OrdersHeader>findByAdvisorId_Id(int id_advisor);
    List<OrdersHeader>findByWinerieId_Id(int id_winerie);
    List<OrdersHeader>findByCustomerId_Id(int id_customer);
    List<OrdersHeader>findByOrderStatusId_Id(int id_order_status);
    List<OrdersHeader>findByPaymentFormId_Id(int id_payment_form);
}
