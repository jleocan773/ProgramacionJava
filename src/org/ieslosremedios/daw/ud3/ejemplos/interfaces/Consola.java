package org.ieslosremedios.daw.ud3.ejemplos.interfaces;

public class Consola implements Imprimible, Borrable{ //4.- Creamos una nueva clase “Consola” que también implemente la misma interfaz
    private String pantalla = "$ "; //4.- El texto por defecto de pantalla será el shell prompt, por ejemplo podemos poner el de linux, que es “$”.

    public void imprime(){                             //4.- Pero ahora el método imprime de esta nueva clase imprimirá el contenido de un campo llamado pantalla
        System.out.printf("%S", pantalla + "\n");    } // utilizando la impresión con formato (printf) para formatear el texto de modo que salga en mayúsculas

    public void establecerContenido(String contenido){
        pantalla = ("$ " + contenido); //5.- Y en el caso de la consola, que haga lo mismo pero precediéndolo del prompt
    }

    public void borrado(){
        pantalla = ("$ " + "**********"); //6.- En el caso de imprimir por consola sustituya el contenido por asteriscos
    }
}
