package org.ieslosremedios.daw.aaa_clases_universales;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Estudiante extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "secuencia1en1")
    @SequenceGenerator(allocationSize = 1, name = "secuencia1en1")
    private Integer id;
    private int participacion;

    private String grupo;
    @Embedded
    private Ordenador ordenadorAsignado;

    public Estudiante(String nombre, String apellidos, int participacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.participacion = participacion;
    }

    public Estudiante(String nombre, int participacion){
        this.nombre = nombre;
        this.participacion = participacion;
    }

    public Estudiante(String nombre, int participacion, String grupo, Ordenador ordenadorAsignado) {
        this.nombre = nombre;
        this.participacion = participacion;
        this.grupo = grupo;
        this.ordenadorAsignado = ordenadorAsignado;
    }

    public Estudiante(String nombre, int participacion, String grupo) {
        super(nombre);
        this.participacion = participacion;
        this.grupo = grupo;
    }

    public Estudiante() {

    }

    public int getParticipacion() {
        return participacion;
    }

    public void setParticipacion(int participacion) {
        this.participacion = participacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ordenador getOrdenadorAsignado() {
        return ordenadorAsignado;
    }

    public void setOrdenadorAsignado(Ordenador ordenadorAsignado) {
        this.ordenadorAsignado = ordenadorAsignado;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Participación: " + getParticipacion() + " | Grupo: " + getGrupo() + " | Ordenador: " + getOrdenadorAsignado();
    }
}
