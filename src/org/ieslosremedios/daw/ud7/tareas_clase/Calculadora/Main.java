package org.ieslosremedios.daw.ud7.tareas_clase.Calculadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número correspondiente a la operación que desea realizar: ");
        System.out.println("1 - SUMA");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICACION");
        System.out.println("4 - DIVISION");
        int operacion = scanner.nextInt();


        if (operacion == 1){
            System.out.println("Has elegido Suma");
            System.out.println("¿Cuantos números quieres sumar?");
            int numerosTotales = scanner.nextInt();
            ArrayList<Integer> numerosParaSumar = new ArrayList();
            int suma = 0;
            for (int i = 0; i < numerosTotales; i++){
                numerosParaSumar.add(scanner.nextInt());
            }
            Iterator iterator = numerosParaSumar.iterator();
            while (iterator.hasNext()){
                suma += (int) iterator.next();
            }
            System.out.println(suma);
        }


        if (operacion == 2){
            System.out.println("Has elegido Resta");
            System.out.println("¿Cuantos números quieres restar?");
            int numerosTotales = scanner.nextInt();
            ArrayList<Integer> numerosParaSumar = new ArrayList();
            int resta = scanner.nextInt();
            for (int i = 0; i < numerosTotales - 1; i++){
                numerosParaSumar.add(scanner.nextInt());
            }
            Iterator iterator = numerosParaSumar.iterator();
            while (iterator.hasNext()){
                resta -= (int) iterator.next();
            }
            System.out.println(resta);
        }

        if (operacion == 3){
            System.out.println("Has elegido Multiplicación");
            System.out.println("¿Cuantos números quieres multiplicar?");
            int numerosTotales = scanner.nextInt();
            ArrayList<Integer> numerosParaSumar = new ArrayList();
            int multiplicacion = 1;
            for (int i = 0; i < numerosTotales; i++){
                numerosParaSumar.add(scanner.nextInt());
            }
            Iterator iterator = numerosParaSumar.iterator();
            while (iterator.hasNext()){
                multiplicacion *= (int) iterator.next();
            }
            System.out.println(multiplicacion);
        }

        if (operacion == 4){
            System.out.println("Has elegido División");
            System.out.println("¿Cuantos números quieres dividir?");
            int numerosTotales = scanner.nextInt();
            ArrayList<Integer> numerosParaSumar = new ArrayList();
            int division = scanner.nextInt();
            for (int i = 0; i < numerosTotales - 1; i++){
                numerosParaSumar.add(scanner.nextInt());
            }
            Iterator iterator = numerosParaSumar.iterator();
            while (iterator.hasNext()){
                division /= (int) iterator.next();
            }
            System.out.println(division);
        }
    }
}
