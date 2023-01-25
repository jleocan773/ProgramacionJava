package org.ieslosremedios.daw.ud4.ejemplos.compararpersona;

public class CompararPersonas {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //Creamos una variable persona1 de tipo persona
        persona1.nombre = "Persona 1"; //Le asignamos el nombre, parámetro implícito

        Persona persona2 = new Persona(); //Creamos una variable persona2 de tipo persona
        persona2.nombre = "Persona 1"; //Le asignamos el nombre, parámetro implícito

        System.out.println(persona1 == persona2); // Esto compara la referencia, como es distinta da false
        System.out.println(persona1.equals(persona2)); //El método equals de Object compara referencia, no contenido como
                                                       //lo hace el de los Arrays, así que da false, por lo que habría que
                                                       //sobreescribir el método "equals" en la clase Persona

    }
}
