package com.example.demo.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modelo de requisicao Postman
 *
 * localhost:9090/buscaMensagemIdioma?language=de
 * Retorna valores do properties de acordo com a linguagem
 */

@RestController
public class InternationalizationController {

    @Autowired
    MessageSource messageSource ;

    @RequestMapping(value = "/buscaMensagemIdioma")
    public String getMessage(){
        String[] params = new String[]{"Leandro"};
        String valor = messageSource.getMessage("welcome.message" ,  params , LocaleContextHolder.getLocale());
        return valor ;
    }


}
