package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class Impresora implements Imprimible{
    private String pagina = "Soy una página que se va a imprimir a continuación";

    public void Imprime() {
        System.out.println(pagina);
    }
}
