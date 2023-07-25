package com.org.practica_1.controller;
import com.org.practica_1.entity.Persona;
import com.org.practica_1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioRestController {

    @Autowired
    PersonaService servicio;
   /* @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }*/

    @GetMapping("/todos")
    public List<Persona> cargarTodos(){
        return servicio.obtenerTodasLasPersonas();
    }
    @PostMapping("/guardar")
    public Persona agregarPersona(@RequestBody Persona persona){
        return servicio.guardarPersona(persona);
    }

}