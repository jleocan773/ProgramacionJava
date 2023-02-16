package org.ieslosremedios.daw.ud4.practica.ej1;

public class TrianguloIsos extends  Geometria implements  Coloreable{
    double base;
    double altura;
    double ladosiguales = 3d;
    String color;

    public TrianguloIsos(double base, double altura, double ladosiguales){
        this.base = base;
        this.altura = altura;
        this.ladosiguales = ladosiguales;
    }


    @Override
    double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = ladosiguales + base;
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
        System.out.println("He pintando el primer Triángulo Isósceles de color: " + color);
    }
}
