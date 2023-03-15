package org.ieslosremedios.daw.ud6.ejercicios.actividad6_2;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.printf("Cuenta atrás desde el número 5: ");cuentaAtrasRecursiva(5);
        System.out.println();

        //Ejercicio 2
        System.out.printf("Suma de los 6 primeros números: ");
        System.out.println(sumaRecursiva(6));

        //Ejercicio 3
        System.out.printf("Número en la posición 7 de Fibonnaci: ");
        System.out.println(fibonnaciRecursivo(7));

        //Ejercicio 4
        System.out.printf("Máximo común divisor de 16 y 160: ");
        System.out.println(maximoComunDivisorRecursivo(16, 160));

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
        else if (i == 0){
            return 0;
        }
        return resultado + sumaRecursiva(i - 1);
    }

    private static int fibonnaciRecursivo(int posicion){
        if ( posicion < 2){
            return  posicion;
        }
        return fibonnaciRecursivo(posicion - 2) + fibonnaciRecursivo(posicion - 1);
    }

    public static int maximoComunDivisorRecursivo(int a, int b) {
        if (b == 0) return a;
        return maximoComunDivisorRecursivo(b, a % b);
    }


}
