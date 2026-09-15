/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ConveyorAccounts;
import java.util.List;


public interface ConveyorAccountsService {
    List<ConveyorAccounts>listar();
    ConveyorAccounts listarId(int id);
    ConveyorAccounts add(ConveyorAccounts c);
    ConveyorAccounts edit(ConveyorAccounts c);
    ConveyorAccounts delete(int id);
    
    List<ConveyorAccounts>listarByIdConveyor(int id_conveyor);
}
