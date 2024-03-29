package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.esquemaVoraz;

public abstract class EsquemaVoraz {
    //Atributos del algoritmo
    int[] solucion;
    int candidato;
    int etapa;

    public void voraz(){
        inicializa();
        while(!fin()){
            seleccionaYEliminaCandidato();
            if (esPrometedor()){
                anotaSolucion();
            }
        }
    }

    protected abstract void anotaSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();


}
