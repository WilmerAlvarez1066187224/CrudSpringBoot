package com.example.hello.interfaces;
import org.springframework.data.repository.CrudRepository;
import com.example.hello.modelo.Persona;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{




}

