/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.SalesChannels;
import java.util.List;


public interface SalesChannelsService {
    List<SalesChannels>listar();
    SalesChannels listarId(int id);
    SalesChannels add(SalesChannels s);
    SalesChannels edit(SalesChannels s);
    SalesChannels delete(int id);
    
    List<SalesChannels>listarByIdList(int id_list);
    List<SalesChannels>listarByIdCompany(int id_company);
}
