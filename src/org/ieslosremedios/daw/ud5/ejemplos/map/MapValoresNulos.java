package org.ieslosremedios.daw.ud5.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class MapValoresNulos {
    public static void main(String[] args) {
        Map<Integer, Object> abecedario = new HashMap();
        abecedario.put(1,"A");
        abecedario.put(2, "B");
        abecedario.put(3, "C");
        abecedario.put(4, "D");
        abecedario.put(5, "E");

        abecedario.put(null, "F");
        System.out.println(abecedario);
        abecedario.put(null, "X");
        System.out.println(abecedario);
    }
}
