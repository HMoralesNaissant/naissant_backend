/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.DispatchsControl;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;

@org.springframework.stereotype.Repository
public interface DispatchsControlRepository extends JpaRepository<DispatchsControl, Integer>{

    @Override
    @EntityGraph(attributePaths = {"invoiceId"})
    List<DispatchsControl> findAll();

    @Override
    @EntityGraph(attributePaths = {"invoiceId"})
    Optional<DispatchsControl> findById(Integer id);

    
    @EntityGraph(attributePaths = {"invoiceId"})
    List<DispatchsControl>findByInvoiceId_Id(int id_invoice);
    @EntityGraph(attributePaths = {"invoiceId"})
    List<DispatchsControl>findByVerified(char verified);
    @EntityGraph(attributePaths = {"invoiceId"})
    List<DispatchsControl>findByDispatched(char dispatched);
}
