package org.ieslosremedios.daw.ud7.tareas_clase;

import java.io.Serializable;

public class PersonaParaEjec10 implements Serializable {
    private static final long serialVersionUID = -5832785526696911012L;

    String nombre;
    String apellido;
    transient String secreto;

    public PersonaParaEjec10(String nombre, String apellido, String secreto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.secreto = secreto;
    }

    public PersonaParaEjec10(){
        this.nombre = "John";
        this.apellido = "Wick";
        this.secreto = "Solía tener un perro";
    }
}
