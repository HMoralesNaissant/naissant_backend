/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Charges;
import java.util.List;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ChargesRepository extends Repository<Charges, Integer>{
    List<Charges>findAll();
    Charges findById(int id);
    Charges save(Charges c);
    void delete(Charges c);
    
    List<Charges>findByAreasId_Id(int id_areas);
}
