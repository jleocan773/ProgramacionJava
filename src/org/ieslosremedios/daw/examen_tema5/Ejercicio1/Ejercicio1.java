package org.ieslosremedios.daw.examen_tema5.Ejercicio1;

import java.util.TreeSet;

/**
 * Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto que se le pasa
 * por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas. Ahora ya puedes usar los nuevos
 * tipos de datos en lugar de un array.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        String texto = "Este es un texto de prueba, repito: texto de prueba.";
        String prueba = "Miau Miau Miau Guau Guau Kikiriki"; //Este tiene 3
        String otraPrueba = "Este último ejemplo tiene un total de diez palabras diferentes";

        System.out.println("El número de palabras diferentes en el texto es: " + contarPalabrasDiferentes(texto));
        // El resultado de este ejemplo es 7

    }

    private static int contarPalabrasDiferentes(String texto) {

        // TODO: Convertir todo el texto a minúsculas para no distinguir mayúsculas y minúsculas


        // Eliminar signos de puntuación y caracteres especiales del texto
        texto = texto.replaceAll("[^a-zA-Z0-9\\s]", "");

        // TODO: Dividir el texto en palabras y guardarlas en el TAD adecuado para eliminar duplicados
        TreeSet<String> conjuntoPalabras = new TreeSet<>();
        String[] palabrasSeparadas = texto.split(" ");
        for (int i = 0; i < palabrasSeparadas.length; i++){
            conjuntoPalabras.add(palabrasSeparadas[i]);
        }

        // TODO: Devolver el resultado
        return conjuntoPalabras.size();
    }
}