/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.SalesChannels;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface SalesChannelsRepository extends JpaRepository<SalesChannels, Integer>{
    
    List<SalesChannels>findByListId_Id(int id_list);
    List<SalesChannels>findByCompanyId_Id(int id_company);
}
