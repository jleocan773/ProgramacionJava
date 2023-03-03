package org.ieslosremedios.daw.ud5.ejemplos.practicapreexamen;

import java.util.Arrays;

public class TestTaskList {
    public static void main(String[] args) {
        TaskList lista = new TaskList("arrayList");

        String[] arrayDeLaLista;
        lista.addTask("Tarea1");
        lista.addTask("Tarea2");
        lista.addTask("Tarea3");
        lista.addTask("Tarea4");
        lista.addTask("Tarea5");
        arrayDeLaLista = lista.getTasks();
        System.out.println(Arrays.toString(arrayDeLaLista));

        lista.removeTask("Tarea4");
        lista.removeTask("Tarea1");
        arrayDeLaLista = lista.getTasks();
        System.out.println(Arrays.toString(arrayDeLaLista));

        lista.completeTask("Tarea2");
        lista.completeTask("Tarea5");
        lista.completeTask("Tarea3");
        arrayDeLaLista = lista.getTasks();
        System.out.println(Arrays.toString(arrayDeLaLista));






    }



}
