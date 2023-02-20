package org.ieslosremedios.daw.ud5.ejemplos.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIteratorNums {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(8);
        numeros.add(2);
        numeros.add(15);
        numeros.add(23);
        numeros.add(21);

        System.out.println(numeros);

        ListIterator<Integer> it = numeros.listIterator();
        while(it.hasNext()){
            Integer i = it.next();
            //Si el número a continuación es mayor de 10, borrarlo
            if (i < 10){
                it.remove();
            }
        }
        System.out.println(numeros);

        //Ahora lo recorremos al revés con el hasPrevious
        while(it.hasPrevious()){
            Integer i = it.previous();
            if (i > 20){
                it.remove();
            }
            if (i == 15) {
                it.add(10);
            }
        }
        System.out.println(numeros);
    }
}