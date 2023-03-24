package org.ieslosremedios.daw.ud7.ejemplos;

import java.io.IOException;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) throws IOException {


        System.out.write(72);
        System.out.write(111);
        System.out.write(108);
        System.out.write(97);
        System.out.write("\nHola".getBytes());

        if (args.length > 0) {
            System.out.println("\nHola " + args[0]);
        }
        else System.err.println("Hace falta al menos un argumento");

        System.out.println("Introduzca su nombre: ");
        int nombre = (System.in.read());

        System.out.println("Hola " + (char)nombre);

    }
}
