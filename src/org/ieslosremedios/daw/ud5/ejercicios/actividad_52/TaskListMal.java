package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskListMal {
    public static void addTask(ArrayList list, String task){
        list.add(task);
        System.out.println("Se ha añadido la tarea <" + task + "> a la lista");
    }
    public static void addTask(LinkedList list, String task){
        list.add(task);
        System.out.println("Se ha añadido la tarea <" + task + "> a la lista");
    }

    public static void removeTask(ArrayList list, String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea <" + taskToDelete + "> a la lista");
    }
    public static void removeTask(LinkedList list, String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea <" + taskToDelete + "> a la lista");
    }

    public static void completeTask(ArrayList list, String task){
        String taskCompleted = "COMPLETADA " + task;
        list.set(list.indexOf(task), taskCompleted);
    }
    public static void completeTask(LinkedList list, String task){
        String taskCompleted = "COMPLETADA " + task;
        list.set(list.indexOf(task), taskCompleted);
    }

    public static String[] getTasks(ArrayList list){
        String[] array = (String[]) list.toArray();
        return array;
    }
    public static String[] getTasks(LinkedList list){
        String[] array = (String[]) list.toArray();
        return array;
    }


}