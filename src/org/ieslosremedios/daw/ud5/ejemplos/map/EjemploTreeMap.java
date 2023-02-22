package org.ieslosremedios.daw.ud5.ejemplos.map;

import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> notas = new TreeMap<>();
        notas.put(5, "Suficiente");
        notas.put(6, "Bien");
        notas.put(7, "Notable Bajo");
        notas.put(8, "Notable Alto");
        notas.put(9, "Sobresaliente Bajo");
        notas.put(10, "Sobresaliente Alto");

        System.out.println(notas);
        //La primera llave
        System.out.println(notas.firstEntry());
        //Elemento por debajo de la llave 7
        System.out.println(notas.lowerEntry(7));



    }
}
