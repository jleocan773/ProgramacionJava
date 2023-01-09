package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class Consola implements Imprimible{
    private String pagina = "Soy una página, pero de org.ieslosremedios.daw.ud3.ejemplos.Interfaces.Consola";
    private String color = " y además, la consola imprime en color";

    public void Imprime(){
        System.out.println(pagina + color);
    }
}
