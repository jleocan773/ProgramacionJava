package org.ieslosremedios.daw.ud4.ejercicios.actividad4_7;

public class Alumno {
    String nombre;
    Integer participacion;

    Alumno() {}

    Alumno (String nombre, Integer participacion){
        this.nombre = nombre;
        this.participacion = participacion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
