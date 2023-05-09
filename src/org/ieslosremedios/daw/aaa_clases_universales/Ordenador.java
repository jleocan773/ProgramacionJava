package org.ieslosremedios.daw.aaa_clases_universales;

import com.objectdb.o.BGT;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
public class Ordenador implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "secuencia10en10")
    @SequenceGenerator(allocationSize = 10, name = "secuencia10en10")
    private Integer id;

    private String IP;
    private String numSerie;
    @Embedded
    //Va en Bytes
    private BigInteger memoria;
    @Embedded
    private BigInteger discoDuro;
    @Embedded
    private String cpu;
    @Embedded
    private Timestamp fechaCompra;

    public Ordenador() {
    }

    public Ordenador(String IP, String numSerie, BigInteger memoria, BigInteger discoDuro, String cpu, Timestamp fechaCompra) {
        this.IP = IP;
        this.numSerie = numSerie;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.cpu = cpu;
        this.fechaCompra = fechaCompra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public BigInteger getMemoria() {
        return memoria;
    }

    public void setMemoria(BigInteger memoria) {
        this.memoria = memoria;
    }

    public BigInteger getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(BigInteger discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "id=" + id +
                ", IP='" + IP + '\'' +
                ", numSerie='" + numSerie + '\'' +
                ", memoria=" + memoria +
                ", discoDuro=" + discoDuro +
                ", cpu='" + cpu + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
