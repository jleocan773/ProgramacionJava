package org.ieslosremedios.daw.ud5.practica;

import java.util.PriorityQueue;
import java.util.Queue;

public class Cola {
    public static void main(String[] args) {
        //Creamos una LinkedList porque guarda los elementos (en nuestro caso guarda Personas) en orden de inserción
        Queue<Persona> colaPersonas = new PriorityQueue<>();

        //Añadimos personas nueva y pintamos la cola de nuevo
        System.out.print("Añadimos personas: ");
        encolar(colaPersonas, "Ana");
        encolar(colaPersonas, "Berto");
        encolar(colaPersonas, "Cristina");
        encolar(colaPersonas, "Daniel");
        encolar(colaPersonas, "Zoe");
        encolar(colaPersonas, "Luis");
        System.out.println(colaPersonas);

        //Quitamos una persona y pintamos la cola de nuevo
        System.out.print("Quitamos la persona en la primera posición, es decir, Ana: ");
        desencolar(colaPersonas);
        System.out.println(colaPersonas);

        //Pintamos el primer elemento de la cola
        System.out.print("Pintamos a la primera persona, que tras la eliminación de Ana será Berto: ");
        frente(colaPersonas);

        //Pintamos el resto de la cola
        System.out.print("Pintamos todos los elementos menos el primero, es decir, no pintamos Berto: ");
        resto(colaPersonas);

        //Vaciamos la cola
        System.out.print("\nLimpiamos la cola: ");
        limpiar(colaPersonas);
        System.out.println(colaPersonas);

        //Comprobamos que la cola esté vacía
        System.out.print("Comprobamos si la cola está vacía: ");
        System.out.println(esVacia(colaPersonas));

        //Pintamos la longitud de la cola
        System.out.print("Pintamos la longitud de la cola: ");
        longitud(colaPersonas);

    }

    private static void encolar(Queue colaPersonas, String nombreParaIntroducir){
        colaPersonas.offer(new Persona(nombreParaIntroducir));
    }

    private static void desencolar(Queue colaPersonas){
        colaPersonas.remove();
    }

    private static void frente(Queue colaPersonas){
        System.out.println(colaPersonas.peek());
    }

    private static void resto (Queue colaPersonas){
        colaPersonas.remove();
        while(!colaPersonas.isEmpty()){
            System.out.print(colaPersonas.poll() + " ");
        }
    }

    private static void limpiar (Queue colaPersonas){
        colaPersonas.clear();
    }

    private static boolean esVacia (Queue colaPersonas){
        if (colaPersonas.isEmpty() == true){
            return true;
        }
        else return false;
    }

    private static void longitud (Queue colaPersonas){
        System.out.println(colaPersonas.size());
    }
}
