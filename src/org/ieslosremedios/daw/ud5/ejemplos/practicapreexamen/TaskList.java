package org.ieslosremedios.daw.ud5.ejemplos.practicapreexamen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private List<String> lista;

    public TaskList(String tipo){
        if("ArrayList".equalsIgnoreCase(tipo)){
            lista = new ArrayList<>();
        }
        if("LinkedList".equalsIgnoreCase(tipo)){
            lista = new LinkedList<>();
        }
    }

    public void addTask(String taskToAdd) {
        lista.add(taskToAdd);
    }

    public void removeTask (String taskToRemove){
        lista.remove(taskToRemove);
    }

    public void completeTask (String taskToComplete){
        int index = lista.indexOf(taskToComplete);
        lista.set(index, "COMPLETADA " + taskToComplete);
    }

    public String[] getTasks(){
        return lista.toArray(new String[0]);
    }

}