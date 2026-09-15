/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ConveyorAccounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ConveyorAccountsRepository extends JpaRepository<ConveyorAccounts, Integer>{
    
    List<ConveyorAccounts>findByConveyorId_Id(int id_conveyor);
}
