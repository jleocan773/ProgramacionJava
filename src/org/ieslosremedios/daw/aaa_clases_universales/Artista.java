package org.ieslosremedios.daw.aaa_clases_universales;

import javax.persistence.Embeddable;
import java.io.Serializable;

// Este campo aunque sea de tipo una clase definida por el
//usuario, No crea una nueva entidad en la base de datos. Esto mejora el
//rendimiento, pero reduce su interoperabilidad
@Embeddable
public class Artista extends Persona implements Serializable {
    private String generoMusica;

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public Artista(String nombre, String generoMusica) {
        super(nombre);
        this.generoMusica = generoMusica;
    }

    public Artista(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public Artista(){}
}
