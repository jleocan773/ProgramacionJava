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
        LinkedList<Integer> listaEnlazada = new LinkedList<>(numeros);
        listaEnlazada.add(7);
        listaEnlazada.add(2);
        listaEnlazada.add(10);

        System.out.println("Imprimimos la lista: " + numeros);
        System.out.println("Imprimimos la lista enlazada: " + listaEnlazada);

        ListIterator<Integer> itLinkedList = listaEnlazada.listIterator(listaEnlazada.size());
        Integer e;


        //Imprimimos la lista con varias condiciones
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

        System.out.println("\nImprimimos la lista enlazada: " + listaEnlazada);

        //Imprimimos el tercer elemento de la lista
        System.out.println("El tercer elemento de la lista enlazada es: " + listaEnlazada.get(2));

        //Cambiamos el valor del elemento en la quinta posición
        listaEnlazada.set(4,666);
        System.out.println(listaEnlazada.get(4));

        //Mostrar si el elemento contiene 666
        System.out.println(listaEnlazada.contains(666));

        //Mostrar la posición donde se encuentra 666
        System.out.println(listaEnlazada.indexOf(666));

        //Eliminar elemento 666 por número
        listaEnlazada.remove((Integer) 666);
        //Eliminar elemento 666 por posición
        //listaEnlazada.remove(4);
        //Otra opción para eliminarlo si desconocemos la posición
        //listaEnlazada.remove(listaEnlazada.indexOf(666));
        System.out.println(listaEnlazada.get(4));

        //Añadir elemento al inicio de la lista
        listaEnlazada.addFirst(999);
        System.out.println(listaEnlazada.get(0));

    }



}
