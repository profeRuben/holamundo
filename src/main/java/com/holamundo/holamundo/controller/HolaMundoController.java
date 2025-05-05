package com.holamundo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo!";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludoPersonalido(@PathVariable String nombre) {
        return "¡Hola " + nombre + "!";
    }

    @GetMapping("/suma/{a}/{b}")
    public String sumar(@PathVariable int a, @PathVariable int b) {
    return "Resultado de la suma: " + (a + b);
}
}