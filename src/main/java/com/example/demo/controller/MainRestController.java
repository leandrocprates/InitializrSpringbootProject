/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.exception.TesteExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author lprates
 */
@RestController
@RequestMapping("/")
public class MainRestController {
    
    
    private static final Logger logger = LoggerFactory.getLogger(MainRestController.class ) ; 
    
    
    @RequestMapping(method = GET)
    public String funcaoMain(){
        return "OK";
    }
    
    @RequestMapping(value = "/nome" , method = GET)
    public String getNome(){
        return "Nome";
    }
    
    @RequestMapping(value = "/testeexception" , method = GET)
    public ResponseEntity<Object> testeExceptionHandler(){
        logger.info("Dentro do controller MainRestController antes de lancar excecao .");
        throw new TesteExceptionHandler(); 
    }
    
    
    
}
