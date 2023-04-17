package org.ieslosremedios.daw.ud7.ejemplos;

import java.io.Serializable;

public class ObjetoSerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    int atributo1;
    static int atributo2;
    //Si queremos que un atributo no se serialice usamos la palabra reservada transient
    transient int atributoTransient;

    public ObjetoSerializable(int atributo1, int atributo2, int atributoTransient) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributoTransient = atributoTransient;
    }

    public ObjetoSerializable() {
        this.atributo1 = 15000;
        this.atributo2 = 25000;
        this.atributoTransient = 35000;
    }
}
