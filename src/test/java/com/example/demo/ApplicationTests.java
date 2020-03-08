package com.example.demo;

import com.example.model.Product;
import java.net.URI;
import java.net.URISyntaxException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    
        String url = "http://localhost:9094/products"; 
    
        @Autowired
        RestTemplate restTemplate;

    
	@Test
	public void contextLoads() throws URISyntaxException {
            System.out.println("Teste 1 ");
            URI uri = new URI(url);
            ResponseEntity<Product> response =  restTemplate.getForEntity(uri, Product.class) ; 
            System.out.println(response.getBody().getName() );
            
        }

}
