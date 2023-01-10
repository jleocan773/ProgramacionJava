package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class Impresora implements Imprimible, Borrable{ //Creamos la clase impresora que implementa la interfaz "Imprimible"
    String pagina = TEXTO_POR_DEFECTO; //Creamos la variable "pagina", que tendrá el valor de la variable "TEXTO_POR_DEFECTO"

    public void Imprime() { //Creamos un constructor en la clase para inicializar la pagina con el TEXTO_POR_DEFECTO
        System.out.println(pagina); //El método deberá imprimir un campo de la clase llamado “página” de tipo cadena.
    }

    public void establecerContenido(String contenido){ //En el caso de la impresora establezca el contenido indicado por parámetro
        System.out.println(contenido);
    }

    public void Borrado() { //En el caso de imprimir por impresora elimine el texto de la página
        System.out.println(" ");
    }
}


