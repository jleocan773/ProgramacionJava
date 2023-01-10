package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class Consola implements Imprimible, Borrable{ //Creamos una nueva clase “Consola” que también implemente la misma interfaz
    private String pantalla = "$"; //El texto por defecto de pantalla será el shell prompt, por ejemplo podemos poner el de linux, que es “$”.

    public void Imprime(){                      //Pero ahora el método imprime de esta nueva clase imprimirá el contenido de un campo llamado pantalla
        System.out.printf("%S", pantalla + "\n");    } //, utilizando la impresión con formato (printf) para formatear el texto de modo que salga en mayúsculas

    public void establecerContenido(String contenido){ //Y en el caso de la consola haga lo mismo pero precediéndolo del prompt
        System.out.printf("%S", contenido + " " + pantalla);
    }

    public void Borrado(){ //En el caso de imprimir por consola sustituya el contenido por asteriscos
        System.out.println("**********");
    }
}
