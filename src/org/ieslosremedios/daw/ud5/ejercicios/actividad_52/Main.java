package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.util.Arrays;

import static org.ieslosremedios.daw.ud5.ejercicios.actividad_52.TaskListMal.getTasks;

public class Main {
    public static void main(String[] args) {
        TaskList listaTareas = new TaskList("arrayList");

        //Voy a

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Añadimos tareas: ");
        listaTareas.addTask("Hacer la colada");
        listaTareas.addTask("Sacar al perro");
        listaTareas.addTask("Comprar pimientos");
        listaTareas.addTask("Arreglar televisor");
        //Cada vez que hago un Sout de la lista aparece la referencia en lugar de los contenidos de esta, ¿cómo podría hacer para mostrar los elementos en lugar
        //de la referencia sin esperar a pasarlo a un array?
        //System.out.println("Mostramos toda la lista con las tareas añadidas: " + listaTareas);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Quitamos la tarea <Sacar al perro>");
        listaTareas.removeTask("Sacar al perro");
        //System.out.println("Mostramos toda la lista con las tareas añadidas: " + listaTareas);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Completamos la tarea <Arreglar televisor>");
        listaTareas.completeTask("Arreglar televisor");
        //System.out.println("Mostramos toda la lista con las tareas añadidas: " + listaTareas);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Pasamos la lista a un array y lo pintamos");
        String[] conversionArray = listaTareas.getTasks();
        System.out.println(Arrays.toString(conversionArray));

    }
}
