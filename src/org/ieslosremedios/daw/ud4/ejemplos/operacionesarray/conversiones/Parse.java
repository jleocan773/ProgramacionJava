package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.conversiones;

public class Parse {
    public static void main(String[] args) {

        //Estos métodos "parse" pasan del tipo cadena (String) al tipo primitivo
        int n = Integer.parseInt("2");
        System.out.println(n);
        boolean b = Boolean.parseBoolean("0");
        System.out.println(b);

        //Estos métodos "valueOf" pasan del tipo cadena (String) al tipo envoltorio
        Integer integer = Integer.valueOf("1");
        System.out.println(integer);
        Double doble = Double.valueOf("56.5656");
        System.out.println(doble);

        //Diferentes formas de pasar números a tipo String
        //Añadiendo el valor numérico y concatenando las ""
        String s = 1 + "";

        //Usando el método "valueOf" de un String
        s = String.valueOf(9);

        //Usando el método "toString" de Integer
        s = Integer.toString(155);
        System.out.println(s);


    }
}
