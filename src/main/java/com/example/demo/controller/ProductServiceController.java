/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.interfacedeclaration.ProductService;
import com.example.demo.interfaceimpl.ProductServiceImpl;
import com.example.model.Product;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lprates
 */
@RestController
public class ProductServiceController {
    
    @Autowired
    private ProductService productServiceImpl ;
    

   @RequestMapping(value = "/products")
   public ResponseEntity<Object> getProduct() {
        System.out.println("Metodo GET products");
        return new ResponseEntity<>(productServiceImpl.getProducts(), HttpStatus.OK);
   }   
   
   @RequestMapping(value = "/products", method = RequestMethod.POST)
   public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        System.out.println("Metodo POST products");
        productServiceImpl.createProduct(product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);       
   }
   
   @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
        System.out.println("Metodo PUT products"); 
        productServiceImpl.updateProduct(id, product);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
   }      
   
   @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
        System.out.println("Metodo DELETE products"); 
        productServiceImpl.deleteProduct(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);   
   }   
    
}
