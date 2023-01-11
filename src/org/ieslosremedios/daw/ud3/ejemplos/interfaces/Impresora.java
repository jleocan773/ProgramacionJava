package org.ieslosremedios.daw.ud3.ejemplos.interfaces;

public class Impresora implements Imprimible, Borrable{ //3.- Creamos la clase impresora que implementa la interfaz "Imprimible"
    String pagina = TEXTO_POR_DEFECTO; //3.- Creamos la variable "pagina", que tendrá el valor de la variable "TEXTO_POR_DEFECTO"

    public void imprime() { //3.- Creamos un constructor en la clase para inicializar la variable "pagina" con el valor de "TEXTO_POR_DEFECTO"
        System.out.println(pagina); //3.- El método deberá imprimir un campo de la clase llamado “página” de tipo cadena.
    }

    public void establecerContenido(String contenido){
         pagina = contenido; //5.- En el caso de la impresora establezca el contenido indicado por parámetro
    }

    public void borrado() {
         pagina = " "; //6.- En el caso de la impresora elimina el texto de la página (muestra vacío)
    }
}


