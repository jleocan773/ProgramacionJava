package org.ieslosremedios.daw.alumnoaleatorio;

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
