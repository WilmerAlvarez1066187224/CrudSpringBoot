package com.example.hello.modelo;


import jakarta.persistence.*;

@Entity //anotaciones @Entity, lo que indica que los objetos de esta clase se pueden almacenar en una base de datos.
@Table(name="persona")//este nombre se cre en bd
public class Persona {
    @Id
//@Id: La anotación @Id indica que el campo al que está adjunto es la clave primaria de la entidad. En este caso, el campo id se considera la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue(strategy = GenerationType.IDENTITY): La anotación @GeneratedValue especifica que el valor del campo se generará automáticamente. En este caso, se utiliza la estrategia de generación de identidad, que es una estrategia común para bases de datos que admiten claves primarias generadas automáticamente, como MySQL.
    private int id;
    private String name;
    private String telefono;

    public Persona() {  //public Persona() {}: Este es un constructor vacío para la clase Persona. A menudo, al usar JPA, es necesario tener un constructor vacío público para que JPA pueda crear instancias de la entidad.

    }



    public Persona(int id,String name,String telefono) {
        super();
        this.id = id;
        this.name = name;
        this.telefono = telefono;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
