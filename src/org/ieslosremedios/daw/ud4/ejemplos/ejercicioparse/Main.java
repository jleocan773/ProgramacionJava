package org.ieslosremedios.daw.ud4.ejemplos.ejercicioparse;

public class Main {
    public static void main(String[] args) {

        //TODO Número entero primitivo de nombre num1 de valor 1

        int num1 = 1;

        //TODO Número entero envoltorio de nombre num2 y valor 2

        Integer num2 = 2;

        //TODO Imprimir valor cadena de num1

        String sNum1 = num1 + "";
        System.out.println(sNum1);
        System.out.println(String.valueOf(num1));

        //TODO Imprimir valor cadena de num2

        String sNum2 = Integer.toString(num2);
        System.out.println(sNum2);
        System.out.println(num2);
    }
}
