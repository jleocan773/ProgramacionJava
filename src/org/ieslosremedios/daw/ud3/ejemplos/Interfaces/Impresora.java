package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class Impresora implements Imprimible, Borrable{ //3.- Creamos la clase impresora que implementa la interfaz "Imprimible"

    public void Imprime() { //3.- Creamos un constructor en la clase para inicializar la variable "pagina" con el valor de "TEXTO_POR_DEFECTO"
        String pagina = TEXTO_POR_DEFECTO; //3.- Creamos la variable "pagina", que tendrá el valor de la variable "TEXTO_POR_DEFECTO"
        System.out.println(pagina); //3.- El método deberá imprimir un campo de la clase llamado “página” de tipo cadena.
    }

    public void establecerContenido(String contenido){
        String pagina = contenido; //5.- En el caso de la impresora establezca el contenido indicado por parámetro
        System.out.println(pagina);
    }

    public void Borrado() {
        String pagina = " "; //6.- En el caso de la impresora elimina el texto de la página (muestra vacío)
        System.out.println(pagina);
    }
}


