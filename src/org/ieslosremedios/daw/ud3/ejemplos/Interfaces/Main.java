package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class Main {
    public static void main(String[]args){
        Imprimible Impresora1 = new Impresora();
        Impresora1.Imprime();

        Imprimible Consola1 = new Consola();
        Consola1.Imprime();
    }
}
