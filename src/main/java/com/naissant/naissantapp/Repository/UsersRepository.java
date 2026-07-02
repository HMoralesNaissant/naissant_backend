/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
    
    List<Users>findByPersonId_Id(int id_person);
    List<Users>findByUserName(String user);
}
