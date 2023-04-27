package org.ieslosremedios.daw.aaa_clases_universales;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class EventoMusical implements Serializable {
    private String nombreEvento;
    private Timestamp fecha;
    private BigInteger recaudacion;

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
