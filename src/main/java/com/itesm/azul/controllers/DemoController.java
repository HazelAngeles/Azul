package com.itesm.azul.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo") //Todas las peticiones que lleguen al servidor con esta peticion van a entrar a este cotnrolador


public class DemoController {
    @GetMapping("/say-hello")
    public String sayHello(){
        return "Hello World";
    }
}
