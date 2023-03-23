package org.ieslosremedios.daw.ud5.practica;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Creamos una LinkedList porque guarda los elementos (en nuestro caso guarda Personas) en orden de inserción
        Cola colaPersonas = new Cola();

        //Creamos varias personas
        Persona ana = new Persona("Ana");
        Persona berto = new Persona("Berto");
        Persona cristina = new Persona("Cristina");
        Persona daniel = new Persona("Daniel");
        Persona zoe = new Persona("Zoe");
        Persona luis = new Persona("Luis");

        //Añadimos personas nueva y pintamos la cola de nuevo
        System.out.print("Añadimos personas: ");
        colaPersonas.encolar(ana);
        colaPersonas.encolar(berto);
        colaPersonas.encolar(cristina);
        colaPersonas.encolar(daniel);
        colaPersonas.encolar(zoe);
        colaPersonas.encolar(luis);
        System.out.println(colaPersonas);

        //Quitamos una persona y pintamos la cola de nuevo
        System.out.print("Quitamos la persona Ana: ");
        colaPersonas.desencolar();
        System.out.println(colaPersonas);

        //Pintamos el primer elemento de la cola
        System.out.print("Pintamos a la primera persona, que tras la eliminación de Ana será Berto: ");
        colaPersonas.frente();

        //Pintamos el resto de la cola
        System.out.print("Pintamos todos los elementos menos el primero, es decir, no pintamos Berto: ");
        colaPersonas.resto();

        //Vaciamos la cola
        System.out.print("\nLimpiamos la cola: ");
        colaPersonas.limpiar();
        System.out.println(colaPersonas);

        //Comprobamos que la cola esté vacía
        System.out.print("Comprobamos si la cola está vacía: ");
        System.out.println(colaPersonas.esVacia());

        //Pintamos la longitud de la cola
        System.out.print("Pintamos la longitud de la cola: ");
        colaPersonas.longitud();

        // A PARTIR DE AQUÍ EMPEZAMOS CON LA PILA
        System.out.println("--------------------------------------------");
        System.out.println("AHORA MOSTRAREMOS LO MISMO PERO CON UNA PILA");
        System.out.println("--------------------------------------------");

        //Creamos el Stack de Personas
        Pila pilaPersonas = new Pila();

        //Añadimos personas a la Pila
        System.out.print("Añadimos personas a la pila: ");
        pilaPersonas.apilar(ana);
        pilaPersonas.apilar(berto);
        pilaPersonas.apilar(cristina);
        pilaPersonas.apilar(daniel);
        pilaPersonas.apilar(zoe);
        pilaPersonas.apilar(luis);
        System.out.println(pilaPersonas);

        //Quitamos el elemento superior de la Pila
        System.out.print("Quitamos el último elemento de la pila, es decir, el que está más arriba (Luis): ");
        pilaPersonas.desapilar();
        System.out.println(pilaPersonas);

        //Vemos cuál es el elemento que se encuentra el último en la pila
        System.out.print("El último elemento de la pila ahora debería de ser Zoe: ");
        pilaPersonas.cima();

        //Limpiamos la pila
        System.out.print("Limpiamos la pila: ");
        pilaPersonas.limpiar();
        System.out.println(pilaPersonas);

        //Comprobamos si está vacía
        System.out.print("Comprobamos si está vacía: ");
        System.out.println(pilaPersonas.esVacia());

        //Pintamos la longitud
        System.out.print("Pintamos la longitud: ");
        pilaPersonas.longitud();

    }
}


