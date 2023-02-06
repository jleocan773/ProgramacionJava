package org.ieslosremedios.daw.ud4.practica.ej2;

//Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto que se le pasa por argumento, sin tener en cuenta si están
// escritas en mayúsculas o minúsculas.

public class Main {
    public static void main(String[] args) {
        System.out.println(contarPalabras("Esta frase tiene cinco palabras"));

    }


    private static int contarPalabras (String texto){ //Creamos el método "contarPalabras" que devolverá un int, aceptando como parámetro un texto para contar
        int contador = 0; //Creo una variable de tipo int que usaré para contar
        String[] arrayParaContar = texto.split(" "); //Creo un array que tendrá como elementos cada palabra del texto separada de un espacio
        for (int i = 0; i < arrayParaContar.length; i++) { //Mientras que "i" sea mejor que la longitud del array creado anteriormente
            contador++; //Se le suma 1 (uno) al valor de contador
        }
        return contador; //Se devuelve contador
    }

}
