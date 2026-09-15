/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.DispatchsLabels;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface DispatchsLabelsRepository extends JpaRepository<DispatchsLabels, Integer>{
    
    List<DispatchsLabels>findByDispatchId_Id(int id_dispatch);
    List<DispatchsLabels>findByInvoiceId_Id(int id_invoice);
    List<DispatchsLabels>findByConveyorId_Id(int id_conveyor);
    List<DispatchsLabels>findByConveyorAccId_Id(int id_conveyor_acc);
    List<DispatchsLabels>findByOriginId_Id(int id_origin);
    List<DispatchsLabels>findByDestinationId_Id(int id_destination);
}
