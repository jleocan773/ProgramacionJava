package org.ieslosremedios.daw.ud3.ejemplos.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Superclase s;

        System.out.println("---------------");
        System.out.println("SuperClase");
        System.out.println("---------------");

        s = new Superclase();
        s.metodo();

        s = new SubclaseA();
        s.metodo();

        s = new SubclaseB();
        s.metodo();

        System.out.println("---------------");


        Interfaz i;

        System.out.println("Interfaz");
        System.out.println("---------------");

        i = new ImplementacionA();
        i.metodoInterfaz();

        i = new ImplementacionB();
        i.metodoInterfaz();

    }
}
