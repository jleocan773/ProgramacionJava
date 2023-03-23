package org.ieslosremedios.daw.ud6.ejercicios.actividad6_4;

import java.util.Arrays;

public class ProblemaMochilaFaccionaria extends EsquemaVoraz{

    private int n;
    private Double max;
    private Double pesoActual;

    private Double[] pesos;
    private Double[] valores;

    public ProblemaMochilaFaccionaria(int n, Double max, Double[] pesos, Double[] valores) {
        this.n = n;
        this.max = max;
        this.pesos = pesos;
        this.valores = valores;
    }

    @Override
    protected void anotaEnSolucion() {
        // Si el candidato entra entero en la mochila se mete entero
        if (pesoActual + pesos[etapa] <= max) {
            candidato = 1d;
        } else { // si sólo entra una parte se mete esa parte
            candidato = Double.valueOf((max - pesoActual)) / pesos[etapa];
        }
        solucion[etapa] = candidato;
        pesoActual = Double.valueOf(pesoActual) + candidato * Double.valueOf(pesos[etapa]);
    }

    /**
     * @return
     */
    @Override
    protected boolean esPrometedor() {
        return true;
    }

    /**
     *
     */
    @Override
    protected void seleccionaYEliminaCandidato() {
        Double mayor = Double.valueOf(valores[0])/pesos[0];
        etapa = 0;
        for (int i = 1; i < n; i++) {
            if (mayor < Double.valueOf(valores[i])/pesos[i]) {
                mayor = Double.valueOf(valores[i])/pesos[i];
                etapa = i;
            }
        }

        // Elimina candidato
        valores[etapa] = 0d;
    }

    /**
     * @return
     */
    @Override
    protected boolean fin() {
        return max.equals(pesoActual);
    }

    /**
     *
     */
    @Override
    protected void inicializa() {
        solucion = new Object[n];
        Arrays.fill(solucion,0);
        pesoActual = 0d;
    }
}