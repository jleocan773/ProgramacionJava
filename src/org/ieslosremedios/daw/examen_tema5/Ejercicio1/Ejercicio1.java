package org.ieslosremedios.daw.examen_tema5.Ejercicio1;

import java.util.Arrays;
import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = "Este es un texto de prueba, repito: texto de prueba."; // El resultado de este ejemplo es 7
        String prueba = "Miau miau miau Guau guay guau Kikiriki kikiriki"; //El resultado de este ejemplo es 3
        String otraprueba = "Este texto de aquí tiene un total de quince palabras diferentes, solamente se repite la palabra de"; //El resultado de este ejemplo es 15

        System.out.println("El número de palabras diferentes en el texto es: " + contarPalabrasDiferentes(otraprueba));
    }

    private static int contarPalabrasDiferentes(String texto) {

        // TODO: Convertir todo el texto a minúsculas para no distinguir mayúsculas y minúsculas
        //Pasamos el texto a minúscula con el método "toLowerCase"
        texto.toLowerCase();

        // Eliminar signos de puntuación y caracteres especiales del texto
        texto = texto.replaceAll("[^a-zA-Z0-9\\s]", "");

        // TODO: Dividir el texto en palabras y guardarlas en el TAD adecuado para eliminar duplicados
        //Cortamos el texto en cada espacio y metemos cada palabra en un Array de tipo String
        String[] textoSinEspacio = texto.split(" ");
        //Creamos un conjunto, elegimos TreeSet porque no acepta repetidos y nosotros no queremos contar las palabras repetidas
        TreeSet<String> conjuntoPalabras = new TreeSet<>();
        //Con un bucle metemos cada palabra del Array en el conjunto con el método "add"
        for (int i = 0; i < textoSinEspacio.length; i++){
            conjuntoPalabras.add(textoSinEspacio[i]);
        }
        // TODO: Devolver el resultado
        //Devolvemos el tamaño del conjunto con el método "size", que devuelve la longitud del conjunto, como el TreeSet no acepta repetidos podemos estar seguro
        //de que el método "size" mostrará cuantas palabras diferentes hay en el texto
        return conjuntoPalabras.size();
    }
}


