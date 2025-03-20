/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Documentos;
import java.util.List;


public interface DocumentosService {
    List<Documentos>listar();
    Documentos listarId(int id);
    Documentos add(Documentos d);
    Documentos edit(Documentos d);
    Documentos delete(int id);
    
    List<Documentos>listarByIdEmpresa(int id_empresa);
}
