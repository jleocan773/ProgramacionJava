package org.ieslosremedios.daw.ud5.ejemplos.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> abecedario = new HashMap();
        abecedario.put(1,"A");
        abecedario.put(2, "B");
        abecedario.put(3, "C");
        abecedario.put(4, "D");
        abecedario.put(5, "E");
        System.out.println(abecedario);

        //LinkedHashMap tiene orden de inserción, como hemos hecho un "putAll" tiene el orden del Hashmap
        //si le diciemos los valores con "put" tendría otro orden
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        //Pasamos los datos de map para hacerlo más rápido
        lhm.putAll(abecedario);
        System.out.println(lhm);

    }
}
