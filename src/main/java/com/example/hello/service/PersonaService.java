package com.example.hello.service;

import com.example.hello.interfaceService.IpersonaService;
import com.example.hello.interfaces.IPersona;
import com.example.hello.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service  //Si tu aplicación sigue mostrando errores relacionados con @Autowired, puedes intentar agregar la anotación @Service a la clase PersonaService para indicar que es un servicio de Spring:
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona personaRepository;


    @Override
    public List<Persona> listar() {

        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int guardar(Persona p) {
        Persona miPersona=personaRepository.save(p);
        return  miPersona.getId();

    }

    @Override
    public void eliminar(int id) {

    }
}
