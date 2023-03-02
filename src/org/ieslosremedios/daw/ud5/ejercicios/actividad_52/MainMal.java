package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MainMal extends TaskListMal {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Añadimos tareas: ");
        addTask(arrayList, "Hacer la colada");
        addTask(arrayList, "Sacar al perro");
        addTask(arrayList, "Comprar pimientos");
        addTask(arrayList, "Arreglar televisor");
        System.out.println("Mostramos toda la lista con las tareas añadidas: " + arrayList);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Quitamos la tarea <Sacar al perro>");
        removeTask(arrayList, "Sacar al perro");
        System.out.println("Mostramos toda la lista; " + arrayList);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Completamos la tarea <Arreglar televisor>");
        completeTask(arrayList, "Arreglar televisor");
        System.out.println("Mostramos toda la lista; " + arrayList);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Pasamos la lista a un array y lo pintamos");
        System.out.println(Arrays.toString(arrayList.toArray()));

    }
}
