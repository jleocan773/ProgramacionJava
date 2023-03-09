package org.ieslosremedios.daw.ud5.practica;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Queue;
import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        //Creamos el Stack de Personas
        Stack<Persona> pilaPersonas = new Stack<>();

        //Añadimos personas a la Pila
        System.out.print("Añadimos personas a la pila: ");
        apilar(pilaPersonas, "Ana");
        apilar(pilaPersonas, "Berto");
        apilar(pilaPersonas, "Cristina");
        apilar(pilaPersonas, "Daniel");
        apilar(pilaPersonas, "Zoe");
        System.out.println(pilaPersonas);

        //Quitamos el elemento superior de la Pila
        System.out.print("Quitamos el último elemento de la pila, es decir, el que está más arriba (Zoe): ");
        desapilar(pilaPersonas);
        System.out.println(pilaPersonas);

        //Vemos cuál es el elemento que se encuentra el último en la pila
        System.out.print("El último elemento de la pila ahora debería de ser Daniel: ");
        cima(pilaPersonas);

        //Limpiamos la pila
        System.out.print("Limpiamos la pila: ");
        limpiar(pilaPersonas);
        System.out.println(pilaPersonas);

        //Comprobamos si está vacía
        System.out.print("Comprobamos si está vacía: ");
        System.out.println(esVacia(pilaPersonas));

        //Pintamos la longitud
        System.out.print("Pintamos la longitud: ");
        longitud(pilaPersonas);

    }

    private static void apilar(Stack pilaPersonas, String nombreParaIntroducir){
        pilaPersonas.push(new Persona(nombreParaIntroducir));
    }

    private static void desapilar(Stack pilaPersonas){
        pilaPersonas.pop();
    }

    private static void cima(Stack pilaPersonas){
        System.out.println(pilaPersonas.peek());
    }

    private static void limpiar(Stack pilaPersonas){
        pilaPersonas.clear();
    }

    private static boolean esVacia(Stack pilaPersonas){
        return pilaPersonas.isEmpty();
    }

    private static void longitud(Stack pilaPersonas){
        System.out.println(pilaPersonas.size());
    }
}
