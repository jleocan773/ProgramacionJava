package org.ieslosremedios.daw.ud3.ejercicios.instrumentos;

public class Main {
    public static void main(String[] args) {
        //Creamos la "instrumento" de clase "Instrumento"
        Instrumento instrumento;

        //Asignamos a "instrumento" el valor de "Guitarra"
        instrumento = new Guitarra();
        //Usamos el método "tocar" de la clase "Guitarra"
        instrumento.tocar();

        //Asignamos a "instrumento" el valor de "Tambor"
        instrumento = new Tambor();
        //Usamos el método "tocar" de la clase "Tambor"
        instrumento.tocar();
    }
}
