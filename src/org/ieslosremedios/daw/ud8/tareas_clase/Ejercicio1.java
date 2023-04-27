package org.ieslosremedios.daw.ud8.tareas_clase;

import org.ieslosremedios.daw.aaa_clases_universales.EventoMusical;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Ejercicio1 {
    public static void main(String[] args) {
        EventoMusical eventoMusical1 = new EventoMusical("Evento 1", Timestamp.valueOf("2023-04-27 00:00:00"), new BigInteger("4000"));
        System.out.println(eventoMusical1);

    }

}
