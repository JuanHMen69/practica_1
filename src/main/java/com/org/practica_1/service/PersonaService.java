package com.org.practica_1.service;

import com.org.practica_1.entity.Persona;
import com.org.practica_1.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> obtenerTodasLasPersonas(){
        return personaRepository.findAll();
    }

    public Persona guardarPersona(Persona persona){
        return personaRepository.save(persona);
    }
}
