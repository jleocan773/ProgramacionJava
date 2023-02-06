package org.ieslosremedios.daw.ud4.practica.ej1;

public class Cuadrado extends Geometria implements Coloreable{
    double lado;
    String color;

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

    @Override
    public void colorear(String color) {
        this.color = color;
        System.out.println(color);
    }
}
