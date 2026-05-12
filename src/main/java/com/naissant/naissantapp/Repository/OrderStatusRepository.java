/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.OrderStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer>{
    
    List<OrderStatus>findByCompanyId_Id(int id_company);
}
