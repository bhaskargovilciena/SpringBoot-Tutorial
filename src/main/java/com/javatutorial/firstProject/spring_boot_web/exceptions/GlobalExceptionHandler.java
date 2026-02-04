package com.javatutorial.firstProject.spring_boot_web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
// @ControllerAdvice returns the response in any type i.e. JSON / HTML etc
public class GlobalExceptionHandler {
    // adding exception handling method
    @ExceptionHandler({NoSuchElementException.class})  // {} helps to combine multiple arguments
    public ResponseEntity<Map<String,Object>> handleNoSuchElementException(NoSuchElementException exception) {
        // defining the object that will be returned
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("message", exception.getMessage());
        errorResponse.put("status", HttpStatus.BAD_REQUEST.value());
        errorResponse.put("timestamp", LocalDateTime.now());
        errorResponse.put("error", "Bad Request");
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Map<String,Object>> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
        Map<String, Object> errorMessage = new HashMap<>();
        errorMessage.put("message", exception.getMessage());
        errorMessage.put("error", "incorrect method called");
        errorMessage.put("error code", HttpStatus.METHOD_NOT_ALLOWED.value());
        errorMessage.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(errorMessage, HttpStatus.METHOD_NOT_ALLOWED);
    }

}
