package org.ieslosremedios.daw.ud4.practica.ej2;

//Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto que se le pasa por argumento, sin tener en cuenta si están
// escritas en mayúsculas o minúsculas.

public class Main {
    public static void main(String[] args) {
        System.out.println(contarPalabras("Frase frase aquí hay siete palabras distintas"));

    }

    private static int contarPalabras (String texto){ //Creamos el método "contarPalabras" que devolverá un int, aceptando como parámetro un texto para contar
        int contador = 0; //Creo una variable de tipo int que usaré para contar
        texto = texto.toLowerCase(); //Paso el texto a minúscula
        String[] arrayPalabrasSeparadas = texto.split(" "); //Creo un array que tendrá como elementos cada palabra del texto separada de un espacio
        String[] palabrasDistintas = new String[arrayPalabrasSeparadas.length]; //Este array será sobre el que haré operaciones para ver las palabras distintas

        for (String palabra : arrayPalabrasSeparadas){
            if (!palabraRepetida(palabrasDistintas, contador, palabra)){
                palabrasDistintas[contador] = palabra;
                contador++;
            }
        }
        return contador; //Se devuelve contador
    }

    private static boolean palabraRepetida(String[] arrayPalabrasSeparadas, int posicionActual, String palabra){
        boolean repetida = false;
        for (int i = 0; i < posicionActual; i++){
            if (arrayPalabrasSeparadas[i].equals(palabra)){
                repetida = true;
                break;
            }
        }
        return repetida;
    }



}
