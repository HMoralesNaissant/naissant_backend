/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.DispatchsLabels;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;

@org.springframework.stereotype.Repository
public interface DispatchsLabelsRepository extends JpaRepository<DispatchsLabels, Integer>{

    @Override
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels> findAll();

    @Override
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    Optional<DispatchsLabels> findById(Integer id);

    
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels>findByDispatchId_Id(int id_dispatch);
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels>findByInvoiceId_Id(int id_invoice);
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels>findByCarrierId_Id(int id_carrier);
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels>findByCarrierAccId_Id(int id_carrier_acc);
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels>findByOriginId_Id(int id_origin);
    @EntityGraph(attributePaths = {"invoiceId", "carrierId", "carrierAccId", "originId", "originId.dptsId", "destinationId", "destinationId.dptsId"})
    List<DispatchsLabels>findByDestinationId_Id(int id_destination);
}
