package org.ieslosremedios.daw.ud4.practica.ej1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Creamos los diferentes objetos que formarán parte del array
        Geometria circ1 = new Circulo(5.2d);
        Geometria circ2 = new Circulo(1.2d);

        Geometria cuad1 = new Cuadrado(3d);
        Geometria cuad2 = new Cuadrado(15d);

        Geometria triiso1 = new TrianguloIsos(5d, 7d, 3d);
        Geometria triiso2 = new TrianguloIsos(10d, 20d, 40d);

        //Creamos el array "figuras", que será de tipo Geometría, con los objetos recién creados
        Geometria[] figuras = {circ1, circ2, cuad1, cuad2, triiso1, triiso2 };
        System.out.println(calcularAreaTotal(figuras));

        // Para comprobar que la suma es correcta:
        // System.out.println(circ1.calcularArea() + circ2.calcularArea() + cuad1.calcularArea() + cuad2.calcularArea() + triiso1.calcularArea() + triiso2.calcularArea());


    }

    private static double calcularAreaTotal(Geometria[] figurasParaCalcularArea){
        double areaTotal = 0; //Creamos la variable que vamos a devolver, que será double,
        for(int i = 0; i < figurasParaCalcularArea.length; i++){ //Mientras que "i" sea menor que la longitud se ejecutará lo siguiente:
            areaTotal += figurasParaCalcularArea[i].calcularArea(); //Al valor de "areaTotal" se le suma el resultado del método de calcularArea del elemento "i"

            //No sé como acceder al nombre de cada elemento para compararlo con el nombre que se le asignaría a la primera figura de cada tipo
            if (figurasParaCalcularArea[i].equals("circ1") ){
                ((Circulo) figurasParaCalcularArea[i]).colorear("Azul");
            }
            else if (figurasParaCalcularArea[i].equals("cuad1") ){
                ((Cuadrado) figurasParaCalcularArea[i]).colorear("Rojo");
            }
            else if (figurasParaCalcularArea[i].equals("triiso1") ){
                ((TrianguloIsos) figurasParaCalcularArea[i]).colorear("Verde");
            }
        }
        return areaTotal;
    }



}
