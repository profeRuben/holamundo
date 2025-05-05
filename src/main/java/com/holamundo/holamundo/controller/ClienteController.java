package com.holamundo.holamundo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

    @GetMapping
    public String index() {
        return "Bienvenidos al listado de clientes";
    }
}
