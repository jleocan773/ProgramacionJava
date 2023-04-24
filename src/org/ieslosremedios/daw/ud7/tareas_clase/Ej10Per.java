package org.ieslosremedios.daw.ud7.tareas_clase;

import java.io.Serializable;

public class Ej10Per implements Serializable {
    private static final long serialVersionUID = -5832785526696911012L;

    String nombre;
    String apellido;
    transient String secreto;

    public Ej10Per(String nombre, String apellido, String secreto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.secreto = secreto;
    }

    public Ej10Per(){
        this.nombre = "John";
        this.apellido = "Wick";
        this.secreto = "Solía tener un perro";
    }
}
