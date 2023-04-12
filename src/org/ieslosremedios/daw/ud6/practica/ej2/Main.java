package org.ieslosremedios.daw.ud6.practica.ej2;

public class Main {
    public static void main(String[] args) {

        //TODO Ejercicio 2

        //Creamos una variable que contendrá el número de discos, cuanto mayor sea el número del disco mayor será su tamaño
        //Por ejemplo: El disco 1 es más pequeño que el disco 2 y se encuentra arriba de este al principio, el disco 2 es más pequeño que el disco 3 y se encuentra
        //arriba de este al principio, y así consecutivamente
        int discos = 4;

        resolverHanoi(discos, "Primera Torre", "Segunda Torre", "Tercera Torre");
    }

    //Creamos el método que resolverá el problema de Hanoi, necesita como parámetros:
    //  Un entero n, que contendrá el número de discos
    //  Tres String, que indicarán desde que torre se tiene que mover el disco y a que torre se mueve
    public static void resolverHanoi(int n, String primeraTorre, String segundaTorre, String terceraTorre) {
        if (n == 1) { //1.*
            System.out.println("Mover el disco 1 de la " + primeraTorre + " a la " + segundaTorre);
            return;
        }
        resolverHanoi(n - 1, primeraTorre, terceraTorre, segundaTorre); // 2.*
        System.out.println("Mover el disco " + n + " de la " + primeraTorre + " a la " + segundaTorre);
        resolverHanoi(n - 1, terceraTorre, segundaTorre, primeraTorre);
    }

    //TODO Ejercicio 3

//    public static void resolverHanoi(int n, String primeraTorre, String segundaTorre, String terceraTorre) {
//        if (n == 1) {                                                                                             O(n)
//            System.out.println("Mover el disco 1 de la " + primeraTorre + " a la " + segundaTorre);               O(n)
//            return;                                                                                               O(n)
//        }
//        resolverHanoi(n - 1, primeraTorre, terceraTorre, segundaTorre);                                           O(1^n)
//        System.out.println("Mover el disco " + n + " de la " + primeraTorre + " a la " + segundaTorre);           O(n)
//        resolverHanoi(n - 1, terceraTorre, segundaTorre, primeraTorre);                                           O(1^n)
//    }

//      3 O(n) + 2 O(1^n) =  O(n) + O(2^n) = O(2^n)
//      Por lo tanto la complejidad de esta algoritmo en notación Big O es de O(2^n)


}
