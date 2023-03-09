package org.ieslosremedios.daw.ud6.tareas_clase.exceptionpropia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList listaArray = new ArrayList();
        insertarNum(listaArray, 5);
        insertarNum(listaArray, 1);
        insertarNum(listaArray, 2);
        System.out.println(listaArray);
        try{
            insertarNum(listaArray,2);
        } catch (ExcepcionRepetida exRep){
            exRep.printStackTrace();
            System.out.println(exRep.getMessage());
        }finally {
            System.out.println(listaArray);
        }
    }

    public static ArrayList insertarNum(ArrayList lista, int num) throws IllegalArgumentException{
        if (lista.contains(num)){
            throw new ExcepcionRepetida("Este número ya se encuentra en la lista, no se ha añadido");
        }
        lista.add(num);
        return lista;
    }


}
