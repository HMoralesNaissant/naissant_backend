/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.InvoicesDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface InvoicesDetailRepository extends JpaRepository<InvoicesDetail, Integer>{
    
    List<InvoicesDetail>findByInvoiceId_Id(int id_invoice);
}
