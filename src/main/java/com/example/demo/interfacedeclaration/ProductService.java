/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.interfacedeclaration;

import com.example.model.Product;
import java.util.Collection;

/**
 *
 * @author lprates
 */
public interface ProductService {
    
   public abstract void createProduct(Product product);
   public abstract void updateProduct(String id, Product product);
   public abstract void deleteProduct(String id);
   public abstract Collection<Product> getProducts();    
   
}
