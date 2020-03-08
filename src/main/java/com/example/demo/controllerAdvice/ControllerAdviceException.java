/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllerAdvice;

import com.example.demo.exception.TesteExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author lprates
 */

@ControllerAdvice
public class ControllerAdviceException {
    
    private static final Logger logger = LoggerFactory.getLogger(ControllerAdviceException.class ) ; 

    @ExceptionHandler(value = TesteExceptionHandler.class)
    public ResponseEntity<Object> controllerAdviceTreatTestExceptionHandler(TesteExceptionHandler testeExceptionHandler ){
        logger.info("Dentro da classe ControllerAdviceException.java tratamento de excecao global ");
        return new ResponseEntity<>("Tratamento de Excepcao: TesteExceptionHandler " , HttpStatus.BAD_REQUEST  ) ; 
    }
    
}
