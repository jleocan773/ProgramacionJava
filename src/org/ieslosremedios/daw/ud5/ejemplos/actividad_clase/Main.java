package org.ieslosremedios.daw.ud5.ejemplos.actividad_clase;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setInicial = new LinkedHashSet<>();
        setInicial.add(1);
        setInicial.add(2);
        setInicial.add(3);
        setInicial.add(4);
        setInicial.add(5);

        List<Integer> numeros = new ArrayList<>(setInicial);

        System.out.println("Lista tal cual es creada: " + numeros);

        //Para desordenar la Colección
        Collections.shuffle(numeros);
        System.out.println("Lista desordenada: " + numeros);

        //Para volver a ordenarla
        Collections.sort(numeros);
        System.out.println("Lista ordenada por orden natural: " + numeros);

        //Para ordenarla en inverso
        Collections.reverse(numeros);
        System.out.println("Lista ordenada de manera inversa: " + numeros);

        //Para hacer la búsqueda binaria la Colección tiene que estar ordenada, así que la ordenamos
        Collections.sort(numeros);
        //Y ejecutamos la búsqueda binaria
        System.out.println("El número que buscas se encuentra en la posición: " + Collections.binarySearch(numeros, 5));

        //Pasamos la Colección a un Array con el siguiente método
        System.out.println("Pasamos esta lista a un array y lo pintamos: " + Arrays.toString(numeros.toArray()));

        //Para pasar un array a una lista
        Integer[] arrayDeNumeros = {100,200,300,400,500};
        List<Integer> listaDesdeArray  = Arrays.stream(arrayDeNumeros).toList();
        System.out.println("Hemos creado un array y lo hemos pasado a una lista: " + listaDesdeArray);

    }
}
