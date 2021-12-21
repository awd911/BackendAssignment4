package com.example.getmesocialservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(exception.class)
    public ResponseEntity<String> rootError(exception exRoot){
        return new ResponseEntity<>(exRoot.userRoot(), HttpStatus.FAILED_DEPENDENCY);
    }

}
