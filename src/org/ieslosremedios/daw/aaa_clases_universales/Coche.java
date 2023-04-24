package org.ieslosremedios.daw.aaa_clases_universales;

import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "Coche")
public class Coche implements Serializable {
    //Para poner un campo como Clave Primaria usamos:
    @Id
    //Para poner el equivalente a AUTO_INCREMENT en MySQL
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "referenciaSEQ")
    //También podemos usar
    @SequenceGenerator (initialValue = 1, allocationSize = 1, name = "referenciaSEQ")
    private Integer referencia;
    private String marca;
    private String color;
    private String matricula;
    //Para guardar un campo que no es persistente o se pone @Embedded o @Entity en la clase en cuestión
    @Embedded
    private Fabricante fabricante;

    public Coche(){}

    public Coche(String marca, String color, String matricula) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
