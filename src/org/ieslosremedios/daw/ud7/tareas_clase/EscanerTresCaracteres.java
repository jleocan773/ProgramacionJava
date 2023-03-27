package org.ieslosremedios.daw.ud7.tareas_clase;

import java.util.Scanner;

public class EscanerTresCaracteres {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduzca el primer carácter");
//        char caracter1 = scanner.nextLine().charAt(0);
//        System.out.println("Introduzca el segundo carácter");
//        char caracter2 = scanner.nextLine().charAt(0);
//        System.out.println("Introduzca el tercer carácter");
//        char caracter3 = scanner.nextLine().charAt(0);
//        System.out.println(""+ caracter1 + caracter2 + caracter3);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una palabra para mostrar sus tres primeros caracteres: ");
        String palabra = scanner.nextLine();
        System.out.println("" + palabra.charAt(0) + palabra.charAt(1) + palabra.charAt(2));

    }
}
