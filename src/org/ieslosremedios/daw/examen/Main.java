package org.ieslosremedios.daw.examen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //TODO Ejercicio 1
        // Se desea almacenar el nombre de todos los profesores que imparten en el grupo de 1º DAW. Para ello, crea una variable llamada nombresProfesores cuyo tipo de dato sea el adecuado para almacenar múltiples valores.
        // Ten en cuenta que no puedes utilizar los TAD vistos en el tema 5.
        // Solo se almacenará la primera parte del nombre. Ejemplo:
        // [Fran, Juan, Juan, Ana, Martín]
        String[] profesores = {"Fran", "Juan", "Juan", "Ana", "Martín"};

        System.out.println("Ejercicio 2");
        mostrarNombres(profesores);

        System.out.println("Ejercicio 3");
        imprimirGuay(profesores);

        System.out.println("Ejercicio 4");
        comprobarNombre(profesores, "Fran");

        System.out.println("Ejercicio 5");
        ordenInverso(profesores);

        System.out.println("Ejercicio 6");
        String[] profesoresOrdenInverso = {"Martin", "Juan", "Juan", "Fran", "Ana"};
        compararArrays(profesores, profesoresOrdenInverso);

        //Ha cambiado el orden porque antes se ha ordenado alfabéticamente el array, el orden ahora ha pasado a ser
        // [Ana, Fran, Juan, Juan, Martín]
        System.out.println("Ejercicio 7");
        profesores = insertarNombre(profesores,"Jonathan", 0);
        System.out.println(Arrays.toString(profesores));

        System.out.println("Ejercicio 8");
        tutorAPrimeraEnMayus(profesores);
        System.out.println(Arrays.toString(profesores));

        System.out.println("Ejercicio 9");
        comprobacionNoDigitos(profesores);

        System.out.println("Ejercicio 10");
        mostrarProfesoresDAW();

    }


    //TODO Ejercicio 2
    // Imprime el contenido de nombresProfesores de forma que resulte una salida por consola como la del ejemplo anterior.
    private static void mostrarNombres (String[] arrayNombres){
        System.out.println(Arrays.toString(arrayNombres));
    }

    //TODO Ejercicio 3
    // Imprime los nombres de manera que la salida ahora quede de la siguiente forma siguiendo el ejemplo:
    // Profesores de 1º DAW:
    // – Fran
    // – Juan
    // – Juan
    // – Ana
    // – Martín

    private static void imprimirGuay (String [] arrayNombres){
        System.out.println("Profesores de 1º DAW");
        for (int i = 0; i < arrayNombres.length; i++)
            System.out.println(" - " + arrayNombres[i]);
    }

    //TODO Ejercicio 4 REVISAR
    // Busca un nombre cualquiera en la variable e indica si está presente ese nombre o no.
    // Ejemplo: si busco “Juan” me devolverá cierto y si busco “Luis” me devolverá falso.

    private static void comprobarNombre (String [] arrayNombres, String nombreABuscar){
        for (int i = 0; i < arrayNombres.length; i++){
            if (arrayNombres[i].equals(nombreABuscar)){
                System.out.println("true");
                break;
            }
            else System.out.println("false");
        }
    }

    //TODO Ejercicio 5
    // Imprime en orden alfabético inverso todos los nombres. Da igual el formato.

    private static void ordenInverso (String [] arrayNombres){
        Arrays.sort(arrayNombres);
        for (int i = arrayNombres.length; i >= 1; i--){
            System.out.println(arrayNombres[i - 1]);
        }
    }

    //TODO Ejercicio 6
    // Compara la variable nombresProfesores original (la del ejercicio 1) con una variable copiaNombresProfesores
    // resultante de ordenar los nombres como se indicó en el ejercicio 5. Sólo nos interesa saber si son iguales o no.
    // En el caso de ser iguales devuelve un entero negativo e imprime la cadena “Iguales” por consola. En caso de que
    // sean diferentes, devuelve la posición del primer nombre que hace que sean diferentes.

    private static void compararArrays (String [] array1, String [] array2){
        if (Arrays.equals(array1, array2) == true){
            System.out.println(-5 + " Los arrays son iguales");
        }
        else System.out.println("Los arrays son distintos");
        }

    //TODO Ejercicio 7
    // Inserta un nuevo nombre pasado como argumento, en la posición pasada como argumento, sin eliminar los nombres que
    // ya existían en el objeto referenciado por la variable nombresProfesores.

    private static String[] insertarNombre(String[] arrayNombres, String nombreAInsertar, int posicion) {
        String[] arrayNombreInsertado = new String[arrayNombres.length + 1];

        for (int i = 0; i < posicion; i++) {
            arrayNombreInsertado[i] = arrayNombres[i];
        }

        arrayNombreInsertado[posicion] = nombreAInsertar;

        for (int i = posicion + 1; i < arrayNombreInsertado.length; i++) {
            arrayNombreInsertado[i] = arrayNombres[i - 1];
        }
        return arrayNombreInsertado;
    }



    //TODO Ejercicio 8
    // Intercambia los nombres de modo que el nombre del tutor o tutora quede en primer lugar y además se convierta a
    // mayúsculas.

    //Nuestra tutora es "Ana", que en estos momentos de la práctica se encuentra en la segunda posición del array, es decir
    //la posición 1 (uno)

    private static String[] tutorAPrimeraEnMayus(String [] arrayNombres){
        String aux = arrayNombres[0];
        arrayNombres[0] = arrayNombres[1].toUpperCase();
        arrayNombres[1] = aux;

        return arrayNombres;
    }

    //TODO Ejercicio 9
    // Valida que ninguno de los nombres contenga un dígito. Puedes usar la siguiente expresión regular: ^[a-zA-Z]*$

    private static void comprobacionNoDigitos (String [] arrayNombres){
        Pattern p = Pattern.compile("!^[a-zA-Z]*$");
        for (int i = 0; i < arrayNombres.length; i++){
            if (p.equals(arrayNombres[i])){
                System.out.println("El formato de los nombres es incorrecto");
            }
            else System.out.println("El formato del nombre " + arrayNombres[i] + " es CORRECTO");
        }
    }

    //TODO Ejercicio 10
    // Crea una estructura de tabla de modo que en cada posición aparezcan los nombres de todos los profesores del grupo
    // que ocupe esa posición.

    private static void mostrarProfesoresDAW(){
        String[][] profesoresAmbosGrupos = {{"Fran", "Juan", "Juan", "Ana", "Martín"}, {"Fran", "Juan", "Juan", "Javi", "Ángela"}};

        for (int i = 0; i < profesoresAmbosGrupos.length; i++){
            for (int j = 0; j < profesoresAmbosGrupos[i].length; j++){
                System.out.println(profesoresAmbosGrupos[i][j]);
            }
        }

    }
}

