/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Country;
import java.util.List;


public interface CountryService {
    List<Country>listar();
    Country listarId(int id);
    Country add(Country c);
    Country edit(Country c);
    Country delete(int id);
}
