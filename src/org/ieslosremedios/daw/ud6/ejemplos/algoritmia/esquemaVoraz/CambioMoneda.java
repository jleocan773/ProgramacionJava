package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.esquemaVoraz;

import java.util.Arrays;

public class CambioMoneda extends EsquemaVoraz{

    //Valores entrada (Input)
    int[] monedas;
    int cambio;

    //Atributos del algoritmo
    int[] solucion;
    int candidato;
    int etapa;

    public CambioMoneda(int[] monedas, int cambio) {
        this.monedas = monedas;
        this.cambio = cambio;
    }

    @Override
    protected void inicializa() {
        solucion = new int[monedas.length];
        Arrays.fill(solucion,0);
        candidato = 0;
        etapa = 0;
    }

    @Override
    protected boolean fin() {
        return etapa > monedas.length - 1;
    }

    @Override
    protected void seleccionaYEliminaCandidato() {
        candidato = cambio / monedas[etapa];
    }

    @Override
    protected boolean esPrometedor() {
        return true;
    }

    @Override
    protected void anotaSolucion() {
        solucion[etapa] = candidato;
        cambio -= monedas[etapa] * candidato ;
        etapa++;
    }

}
