/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 * */

package com.naissant.naissantapp.domain;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ResponseDto{
    
    private String message;
    private Object data;
    private boolean success;

    public ResponseDto() {
    }

    public ResponseDto(Object data, boolean success) {
        this.data = data;
        this.success = success;
    }

    public ResponseDto(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public ResponseDto(String message, Object data, boolean success) {
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public ResponseDto(String message) {
        this.message = message;
    }
    
   
}