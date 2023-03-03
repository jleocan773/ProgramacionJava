package org.ieslosremedios.daw.ud5.ejercicios.actividad_52;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {

    private List<String> list;

    public TaskList(String tipo){
        if("arrayList".equalsIgnoreCase(tipo)){
            list = new ArrayList<>();
        }
        if("linkedList".equalsIgnoreCase(tipo)){
            list = new LinkedList<>();
        }
    }

    public void addTask(String taskToAdd){
        list.add(taskToAdd);
        System.out.println("Se ha añadido la tarea <" + taskToAdd + "> a la lista");
    }

    public void removeTask(String taskToDelete){
        list.remove(taskToDelete);
        System.out.println("Se ha eliminado la tarea <" + taskToDelete + "> de la lista");
    }

    public void completeTask(String taskToComplete){
        String taskCompleted = "COMPLETADA " + taskToComplete;
        list.set(list.indexOf(taskToComplete), taskCompleted);
        System.out.println("Se ha completado la tarea <" + taskToComplete + "> de la lista");
    }

    public String[] getTasks(){
        return list.toArray(new String[0]);
    }

}
