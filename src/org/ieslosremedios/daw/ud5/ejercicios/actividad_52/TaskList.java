package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TaskList {
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

    private static void addTask(ArrayList list, String task){
        list.add(task);
        System.out.println("Se ha añadido la tarea <" + task + "> a la lista");
    }
    private static void addTask(LinkedList list, String task){
        list.add(task);
        System.out.println("Se ha añadido la tarea <" + task + "> a la lista");
    }

    private static void removeTask(ArrayList list, String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea <" + taskToDelete + "> a la lista");
    }
    private static void removeTask(LinkedList list, String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea <" + taskToDelete + "> a la lista");
    }

    private static void completeTask(ArrayList list, String task){
        String taskCompleted = "COMPLETADA " + task;
        list.set(list.indexOf(task), taskCompleted);
    }
    private static void completeTask(LinkedList list, String task){
        String taskCompleted = "COMPLETADA " + task;
        list.set(list.indexOf(task), taskCompleted);
    }

    private static String[] getTasks(ArrayList list){
        String[] array = (String[]) list.toArray();
        return array;
    }
    private static String[] getTasks(LinkedList list){
        String[] array = (String[]) list.toArray();
        return array;
    }


}