/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Conceptos;
import java.util.List;


public interface ConceptosService {
    List<Conceptos>listar();
    Conceptos listarId(int id);
    Conceptos add(Conceptos c);
    Conceptos edit(Conceptos c);
    Conceptos delete(int id);
    
    List<Conceptos>listarByIdEmpresa(int id_empresa);
}
