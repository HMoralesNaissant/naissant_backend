/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */

package com.naissant.naissantapp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
   
}