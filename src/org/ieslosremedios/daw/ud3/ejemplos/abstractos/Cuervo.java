package org.ieslosremedios.daw.ud3.ejemplos.abstractos;

public class Cuervo extends Animal{
    final static Integer numPatas = 2;
    final static Boolean mamifero = false;
    final static Boolean volador = true;
    final static String sonido = "CAW CAW";

    @Override
    Integer getNumPatas() {return numPatas;}
    @Override
    Boolean esMamifero(){return mamifero;}
    @Override
    Boolean esVolador() {return volador;}
    @Override
    String hablar() {return sonido;}
}
