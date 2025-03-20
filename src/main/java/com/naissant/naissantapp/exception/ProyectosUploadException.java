/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro -2021
 **/

package com.naissant.naissantapp.exception;

import com.naissant.naissantapp.message.ProyectosFile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@ControllerAdvice
public class ProyectosUploadException {
    
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<ProyectosFile> maxSizeException(MaxUploadSizeExceededException exc){
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                .body(new ProyectosFile("Uno o más archivos exceden el tamaño máximo"));
    }
}