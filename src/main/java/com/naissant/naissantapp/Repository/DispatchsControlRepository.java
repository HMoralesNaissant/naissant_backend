/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.DispatchsControl;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface DispatchsControlRepository extends JpaRepository<DispatchsControl, Integer>{
    
    List<DispatchsControl>findByInvoiceId_Id(int id_invoice);
}
