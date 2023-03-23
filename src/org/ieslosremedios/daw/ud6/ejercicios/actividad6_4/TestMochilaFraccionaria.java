package org.ieslosremedios.daw.ud6.ejercicios.actividad6_4;

import java.util.Arrays;

public class TestMochilaFraccionaria {
    public static void main(String[] args) {
        double max = 100;
        int n = 5;
        Double[] pesos = {10D, 20D, 30D, 40D, 50D};
        Double[] valores = {20D, 30D, 66D, 40D, 60D};

        ProblemaMochilaFaccionaria pmf = new ProblemaMochilaFaccionaria(n, max, pesos, valores);
        pmf.voraz();
        System.out.println(Arrays.toString(pmf.solucion));
    }
}