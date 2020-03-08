package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Application implements CommandLineRunner{

        private static final Logger logger = LoggerFactory.getLogger(Application.class);
    
        @Value("${spring.application.name:teste}")
        String name ; 

        @Autowired
        static RestTemplate restTemplate;
        
    
	public static void main(String[] args) {
        
            SpringApplication.run(Application.class, args);
            logger.info("this is a info message");
            logger.warn("this is a warn message");
            logger.error("this is a error message");

            //restTemplate.execute("http://www.uol.com.br",null,null,null,null,null);

	}

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Dentro do metodo run ............. : " + name );
        }

        @Bean
        public RestTemplate getRestTemplate(){
            return new RestTemplate();
        }
        
        
}
