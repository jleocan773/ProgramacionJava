package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.esquemaVoraz;

import java.util.Arrays;

public class TestCambioMoneda {
    public static void main(String[] args) {

        int[] monedas = {50,20,10,5,1};
        int cambio = 38;

        CambioMoneda cambioMoneda = new CambioMoneda(monedas, cambio);
        cambioMoneda.voraz();
        System.out.println(Arrays.toString(cambioMoneda.solucion));
    }
}
