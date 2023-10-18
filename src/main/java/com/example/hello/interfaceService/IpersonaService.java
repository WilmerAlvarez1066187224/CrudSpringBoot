package com.example.hello.interfaceService;
import java.util.List;
import java.util.Optional; //Este código representa una interfaz en un proyecto de Spring Boot
                          // que define un servicio para operaciones relacionadas con la entidad Persona .
                         //Aquí está la explicación línea por línea:

import com.example.hello.modelo.Persona;

public interface IpersonaService {   //public interface IpersonaService { ... }:
                                      // Esta es la declaración de la interfaz IpersonaService.
                                      // Define los métodos que se utilizarán para realizar
                                      // operaciones relacionadas con la entidad Persona.
    public List<Persona>listar(); //public List<Persona> listar();: Este método define la operación para obtener una lista de todas las personas.
    public Optional<Persona>listarId(int id);//public Optional<Persona> listarId(int id);: Este método define la operación para obtener una persona por su identificador.

    public int guardar(Persona p);  //public int save(Persona p);: Este método define la operación para guardar
                                  // una nueva persona. Presumiblemente,
                                  // devuelve un entero que indica el resultado de la operación de guardado.
    public  void eliminar(int id);//public void delete(int id);: Este método define la operación para eliminar una persona
                                // por su identificador.
}
