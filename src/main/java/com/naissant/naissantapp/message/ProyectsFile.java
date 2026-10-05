/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProyectsFile {
    private String message;

    public ProyectsFile(String message) {
        this.message = message;
    }
    
}
