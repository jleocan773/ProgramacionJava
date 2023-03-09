package org.ieslosremedios.daw.ud6.tareas_clase;

import java.util.ArrayList;

public class ExceptionLista {
    public static void main(String[] args) {
        ArrayList listaArray = new ArrayList();
        insertarNum(listaArray, 5);
        insertarNum(listaArray, 1);
        insertarNum(listaArray, 2);
        System.out.println(listaArray);
        try{
            insertarNum(listaArray,2);
        }catch (IllegalArgumentException ilex){
            ilex.printStackTrace();
            System.out.println(ilex.getMessage());
        }finally {
            System.out.println(listaArray);
        }
    }

    private static ArrayList insertarNum(ArrayList lista, int num) throws IllegalArgumentException{
        if (lista.contains(num)){
            throw new IllegalArgumentException("Este número ya se encuentra en la lista, no se ha añadido");
        }
        lista.add(num);
        return lista;
    }

}
