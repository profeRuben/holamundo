package com.holamundo.holamundo.controller;

import com.holamundo.holamundo.model.Producto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoController {

    private List<Producto> productos = Arrays.asList(
        new Producto(1, "Laptop"),
        new Producto(2, "Mouse"),
        new Producto(3, "Teclado")
    );

    @GetMapping
    public String index() {
        return "Bienvenidos al listado de productos";
    }

    @GetMapping("/{idProducto}")
    public ResponseEntity<?> buscar(@PathVariable int idProducto) {
    for (Producto p : productos) {
        if (p.getId() == idProducto) {
            return ResponseEntity.ok(p);
        }
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado");
}
    
}

