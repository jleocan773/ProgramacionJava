package org.ieslosremedios.daw.ud4.practica.ej1;

public class Cuadrado extends Geometria implements Coloreable{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        double area = lado*lado;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 4*lado;
        return perimetro;
    }
}
