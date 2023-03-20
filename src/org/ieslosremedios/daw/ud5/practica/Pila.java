package org.ieslosremedios.daw.ud5.practica;


import java.util.LinkedList;
import java.util.List;

public class Pila {

    private List pila = new LinkedList<>();

    public void apilar(Object element){
        pila.add(element);
    }

    public void desapilar(){
        pila.remove(pila.size() - 1);
    }

    public void cima(){
        System.out.println(pila.get(pila.size() - 1));
    }

    public void limpiar(){
        pila.clear();
    }

    public boolean esVacia(){
        return pila.isEmpty() == true;
    }

    public void longitud(){
        System.out.println(pila.size());
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}
