package org.ieslosremedios.daw.ud7.ejemplos;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {

        Scanner scannerInput = new java.util.Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = scannerInput.nextLine();
        System.out.println(nombre.charAt(0));

    }
}
