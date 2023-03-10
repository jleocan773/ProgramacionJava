package org.ieslosremedios.daw.ud6.ejemplos.recursividad;

public class Factorial {
    public static void main(String[] args) {
        factorialIterativo(6);
        System.out.println(factorialRecursivo(4));

    }

    private static void factorialIterativo(int i){
        int resultado = 1;
        for(;i > 1;i--){
            resultado = resultado*i;
        }
        System.out.println(resultado);
    }

    private static int factorialRecursivo(int i){
        if(i <= 1) {
            return 1;
        }
        return i * factorialRecursivo(i - 1);
    }
}
