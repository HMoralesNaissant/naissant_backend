/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.FormasPagos;
import java.util.List;


public interface FormasPagosService {
    List<FormasPagos>listar();
    FormasPagos listarId(int id);
    FormasPagos add(FormasPagos f);
    FormasPagos edit(FormasPagos f);
    FormasPagos delete(int id);
    
    List<FormasPagos>listarByIdEmpresa(int id_empresa);
}
