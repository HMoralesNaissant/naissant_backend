/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.exception;

import com.naissant.naissantapp.message.ProyectsFile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@ControllerAdvice
public class ProyectsUploadException {
    
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<ProyectsFile> maxSizeException(MaxUploadSizeExceededException exc){
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                .body(new ProyectsFile("Uno o más archivos exceden el tamaño máximo"));
    }
}