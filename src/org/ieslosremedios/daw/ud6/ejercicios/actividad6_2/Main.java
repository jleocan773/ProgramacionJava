package org.ieslosremedios.daw.ud6.ejercicios.actividad6_2;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        cuentaAtrasRecursiva(5);
        System.out.println();

        //Ejercicio 2
        System.out.println(sumaRecursiva(6));

        //Ejercicio 3
        System.out.println(fibonnaciRecursivo(7));

        //Ejercicio 4

    }

    private static void cuentaAtrasRecursiva(int i){
        if (i > 0) {
            System.out.print(i + " ");
            cuentaAtrasRecursiva(i-1);
        }
    }

    private static int sumaRecursiva(int i) {
        int resultado = i;
        if (i == 1) {
            return 1;
        }
        return resultado += sumaRecursiva(i - 1);
    }

    private static int fibonnaciRecursivo(int posicion){
        if ( posicion < 2){
            return  posicion;
        }
        return fibonnaciRecursivo(posicion - 2) + fibonnaciRecursivo(posicion - 1);
    }
}
