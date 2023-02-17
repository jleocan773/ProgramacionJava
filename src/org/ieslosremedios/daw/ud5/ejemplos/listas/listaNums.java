package org.ieslosremedios.daw.ud5.ejemplos.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listaNums {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);


        ListIterator<Integer> it = numeros.listIterator();
//        while(it.hasNext()){
//            Integer i = it.next();
//            //Si el número a continuación es mayor de 10, borrarlo
//            if (i > 10){
//                it.remove();
//            }
//        }
//        System.out.println(numeros);
//    }
//
        //Recorremos en orden con el hasNext
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Ahora lo recorremos al revés con el hasPrevious
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(numeros);
    }
}