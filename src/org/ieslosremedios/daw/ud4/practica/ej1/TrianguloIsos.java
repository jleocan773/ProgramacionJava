package org.ieslosremedios.daw.ud4.practica.ej1;

public class TrianguloIsos extends  Geometria implements  Coloreable{
    double base;
    double altura;
    double ladosiguales = 3d;

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
}
