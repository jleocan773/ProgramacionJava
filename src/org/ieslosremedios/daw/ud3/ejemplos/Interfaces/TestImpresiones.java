package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

/** 7.- Crea una clase “TestImpresiones” con un método main donde se imprima desde la impresora y desde consola, en orden:
            1.- El contenido por defecto

            2.- El contenido después de ser borrado

            3.- El contenido después de ser establecido al valor “Esto es un test */

public class TestImpresiones {
    public static void main(String[]args){

        /** 9.- En el método main, en lugar de crear objetos de tipo Impresora y Consola, créalos todos de tipo Imprimible. ¿Sigue funcionando
                igual? ¿Por qué? Contestar en un comentario


        Imprimible Impresora1 = new Impresora()  9.- En el método main, en lugar de crear objetos de tipo Impresora y Consola, créalos todos de tipo Imprimible
        Imprimible Consola1 = new Consola();  9.- En el método main, en lugar de crear objetos de tipo Impresora y Consola, créalos todos de tipo Imprimible

        No, no sigue funcionando igual, el método "Borrado" no es accesible por parte de "Imprimible", por lo que tanto Impresora1 como Consola1 no tendrían acceso
            a ese método, podríamos solucionar esto si "Imprimible" heredase de "Borrable" */

        Impresora Impresora1 = new Impresora();
        System.out.println("-------------------------------------");

        System.out.println("IMPRESORA: ");
        Impresora1.Imprime(); //El contenido por defecto
        Impresora1.Borrado(); //El contenido después de ser borrado
        Impresora1.establecerContenido("Este es el contenido de la Impresora1"); //El contenido después de ser establecido a un valor

        System.out.println("-------------------------------------");

        Consola Consola1 = new Consola();
        System.out.println("CONSOLA");
        Consola1.Imprime(); //El contenido por defecto
        Consola1.Borrado(); //El contenido después de ser borrado
        Consola1.establecerContenido("Este es el contenido de la Consola1, que va antes que el prompt, aunque no sé si todo en mayúscula (?)"); //El contenido después de ser establecido a un valor

        System.out.println("\n-------------------------------------");

    }
}
