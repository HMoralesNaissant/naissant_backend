/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Procedimientos;
import java.util.List;


public interface ProcedimientosService {
    List<Procedimientos>listar();
    Procedimientos listarId(int id);
    Procedimientos add(Procedimientos p);
    Procedimientos edit(Procedimientos p);
    Procedimientos delete(int id);
    
    List<Procedimientos>listarByIdConcepto(int id_concepto);
}
