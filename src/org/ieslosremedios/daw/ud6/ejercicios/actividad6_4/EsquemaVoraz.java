package org.ieslosremedios.daw.ud6.ejercicios.actividad6_4;

public abstract class EsquemaVoraz {
    // Atributos internos del algoritmo
    Object[] solucion;
    Double candidato;
    int etapa;
    public void voraz () {
        inicializa();
        while (!fin()) {
            seleccionaYEliminaCandidato();
            if (esPrometedor()) {
                anotaEnSolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();

}