package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handle(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Runtime Exception: " + exception.getMessage());
    }

    // When this is comment out, spring will look up to find which class does IllegalArgumentException extends and use that handler
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ResponseEntity<String> handle(IllegalArgumentException exception) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                .body("IllegalArgumentException: " + exception.getMessage());
//    }
}
