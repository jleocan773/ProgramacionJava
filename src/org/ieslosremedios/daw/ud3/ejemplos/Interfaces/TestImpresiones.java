package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public class TestImpresiones {
    public static void main(String[]args){
        Impresora Impresora1 = new Impresora();
        System.out.println("IMPRESORA: ");
        Impresora1.Imprime(); //El contenido por defecto
        Impresora1.Borrado(); //El contenido después de ser borrado
        Impresora1.establecerContenido("Este es el contenido de la Impresora1"); //El contenido después de ser establecido a un valor

        System.out.println("---------------------------");

        Consola Consola1 = new Consola();
        System.out.println("CONSOLA");
        Consola1.Imprime(); //El contenido por defecto
        Consola1.Borrado(); //El contenido después de ser borrado
        Consola1.establecerContenido("Este es el contenido de la Consola1, que va antes que el prompt, aunque no se si todo en mayúscula (?)"); //El contenido después de ser establecido a un valor
    }
}
