package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.util.Arrays;

import static org.ieslosremedios.daw.ud5.ejercicios.actividad_52.TaskListMal.getTasks;

public class Main {
    public static void main(String[] args) {
        TaskList listaTareas = new TaskList("arrayList");

        //Voy a usar el método getTasks para convertir la lista en un array con el fin de mostrar que cada operación se ha
        //hecho correctamente, esto también podríamos hacerlo si sobrescribiésemos el método toString de ArrayList/LinkedList
        String[] conversionArray;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Añadimos tareas: ");
        listaTareas.addTask("Hacer la colada");
        listaTareas.addTask("Sacar al perro");
        listaTareas.addTask("Comprar pimientos");
        listaTareas.addTask("Arreglar televisor");
        //Añadimos a conversionArray los valores con el getTasks
        conversionArray = listaTareas.getTasks();
        System.out.println(Arrays.toString(conversionArray));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Quitamos la tarea <Sacar al perro>");
        listaTareas.removeTask("Sacar al perro");
        //Actualizamos los valores tras el borrado
        conversionArray = listaTareas.getTasks();
        System.out.println(Arrays.toString(conversionArray));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Completamos la tarea <Arreglar televisor>");
        listaTareas.completeTask("Arreglar televisor");
        //Actualizamos los valores tras el modificado
        conversionArray = listaTareas.getTasks();
        System.out.println(Arrays.toString(conversionArray));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Pasamos la lista a un array con el método getTasks y lo pintamos");
        System.out.println(Arrays.toString(conversionArray));

    }
}
