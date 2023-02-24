package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskList {

    private static void addTask(ArrayList list, String task){
        list.add(task);
        System.out.println("Se ha añadido la tarea " + task + " a la lista " + list);
    }
    private static void addTask(LinkedList list, String task){
        list.add(task);
        System.out.println("Se ha añadido la tarea " + task + " a la lista " + list);
    }

    private static void removeTask(ArrayList list, String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea " + taskToDelete + " a la lista " + list);
    }
    private static void removeTask(LinkedList list, String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea " + taskToDelete + " a la lista " + list);
    }

    private static void completeTask(ArrayList list, String task){
        String taskCompleted = "COMPLETADA" + list;

    }



}