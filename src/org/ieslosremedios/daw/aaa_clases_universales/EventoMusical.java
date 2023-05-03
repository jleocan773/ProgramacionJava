package org.ieslosremedios.daw.aaa_clases_universales;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class EventoMusical implements Serializable {

    //Para crear un campo para Clave Primaria usamos @Id, para generar un patrón a seguir para la Base de Datos usamos:
    //@GeneratedValue, en el que se especifica el tipo de cálculo de valor y el nombre del generador de la secuencia
    //@SequenceGenerator, en el que se especifica el valor inicial, cuanto se le añade cada vez y el nombre del generador
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "secuencia10en10")
    @SequenceGenerator(initialValue = 10, allocationSize = 10, name = "secuencia10en10")
    private Integer id;

    // Si no se desea que se almacenen tipos persistentes usamos @Transient
    @Transient
    private Integer control;
    private String nombreEvento;
    private Timestamp fecha;
    private BigInteger recaudacion;

    @Enumerated(EnumType.ORDINAL)
    private Genero genero;

    //Este campo aunque sea de tipo una clase definida por el usuario, No crea una nueva entidad en la base de datos.
    // Esto mejora el rendimiento, pero reduce su interoperabilidad.
    @Embedded
    private List<Artista> artistasConfirmados;

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public BigInteger getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigInteger recaudacion) {
        this.recaudacion = recaudacion;
    }

    public EventoMusical(String nombreEvento, Timestamp fecha, BigInteger recaudacion) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    public EventoMusical() {
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombreEvento() + " | Fecha: " + getFecha() + " | Recaudación: " + getRecaudacion();
    }
}
