/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.DispatchsControl;
import java.util.List;

public interface DispatchsControlService {
    List<DispatchsControl>listar();
    DispatchsControl listarId(int id);
    DispatchsControl add(DispatchsControl d);
    DispatchsControl edit(DispatchsControl d);
    DispatchsControl delete(int id);
    
    List<DispatchsControl>listarByIdInvoice(int id_invoice);
}
