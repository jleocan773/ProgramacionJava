package org.ieslosremedios.daw.ud5.ejemplos.linked_list;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(8);
        numeros.add(2);
        numeros.add(15);
        numeros.add(23);
        numeros.add(21);

        //Podemos construir una LinkedList en base a una lista, vamos a usar la que tenemos de un ejemplo anterior para ello
        LinkedList<Integer> linkedList = new LinkedList<>(numeros);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(10);

        System.out.println("Imprimimos la lista: " + numeros);
        System.out.println("Imprimimos la lista enlazada: " + linkedList);

        ListIterator<Integer> itLinkedList = linkedList.listIterator(linkedList.size());
        Integer e;

        System.out.print("[");
        while (itLinkedList.hasPrevious()){
            e = itLinkedList.previous();
            if (e == 23){
                itLinkedList.add(11);
            }
            if (e == 15){
                itLinkedList.remove();
            }
            System.out.print(e);
            if (itLinkedList.hasPrevious()){
                System.out.print(",");
            }
        }
        System.out.print("]");

        System.out.println("\nImprimimos la lista enlazada: " + linkedList);
    }


}
