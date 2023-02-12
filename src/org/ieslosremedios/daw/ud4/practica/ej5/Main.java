package org.ieslosremedios.daw.ud4.practica.ej5;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("La palabra que buscas se encuentra " + contarOcurrenciasPalabras("La palabra que voy a buscar es palabra porque palabra es una buena palabra", "palabra") + " vez/veces");

    }

    private static int contarOcurrenciasPalabras (String texto, String palabraParaBuscar){ //Usamos el mismo método del ejercicio 2
        int contador = 0; //Creo una variable de tipo int que usaré para contar
        String[] arrayParaContar = texto.split(" "); //Creo un array que tendrá como elementos cada palabra del texto separada de un espacio
        for (int i = 0; i < arrayParaContar.length; i++) { //Mientras que "i" sea mejor que la longitud del array creado anteriormente
            if ( palabraParaBuscar.equals(arrayParaContar[i]) ){ //Si la palabra a buscar es igual qie el elemento en posición "i", se suma uno al contador
                contador++;
            }
        }
        return contador; //Se devuelve contador
    }

}
