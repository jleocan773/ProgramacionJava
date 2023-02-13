package org.ieslosremedios.daw.ud4.practica.ej4;
public class Main {
    public static void main(String[] args) {
        String dni = "27998871M"; //Creamos una variable de tipo String que contendrá el DNI
        validarDNI(dni);          //Ejecutamos el método validarDNI, definido abajo
    }

    private static void validarDNI(String dni) { //El método validarDNI hará dos comprobaciones y llamará a otros dos métodos para comprobar si el DNI es correcto
        if (dni.length() == 9 && Character.isLetter(dni.charAt(8)) == true && formatoCorrecto(dni) == true && letraCorrecta(dni) == true) {
            System.out.println("Válido"); //Si se cumplen todas las condiciones de arriba, el DNI será válido
        }
        else System.out.println("No Válido"); //De lo contrario, no lo será
    }

    private static boolean formatoCorrecto(String dni) { //El método formatoCorrecto comprobará que los 8 primeros caracteres del DNI no sean letras
        for (int i = 0; i < dni.length() - 1; i++) {     //Con un bucle for recorremos la longitud de DNI - 1, comprobando que no sean letras
            if (Character.isLetter(dni.charAt(i))){
                return false;                            //Si se encontrase con una letra, devolvería falso
            }
        }
    return true;                                         //Si no lo hace, devuelve verdadero
    }

    private static boolean letraCorrecta(String dni){    //Este método comprueba que la letra es la que toca al hacer la división correcta
        int conversionDNI = Integer.parseInt(dni.substring(0,8)); //Como necesitamos solo la parte numérica del DNI para hacer la comprobación de la letra
                                                                  //vamos a hacer lo siguiente, creo una variable de tipo int "conversionDNI" y como quiero que sea
                                                                  //de la posición 0 a la 8, es decir, sin pillar la última letra, uso el método "substring" de
                                                                  //String, pero como no puedo inicializar un tipo int a un tipo String, que sería lo que devuelve
                                                                  //el método "substring", uso el método parseInt de Integer.

        //Creo un array que tendrá por orden todas las letras equivalentes al resto de dividir entre 23
        Character[] letrasValidas = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        //Creo la variable "resto" de tipo int, que será el resultado de dividir la parte numérica del DNI por 23
        int resto = conversionDNI % 23;
        //Creamos la variable "letraCorrecta" de tipo Character que será igual a la letra en la posición del array del resto
        Character letraCorrecta = letrasValidas[resto];

        if(dni.charAt(8) == letraCorrecta) { //Si la letra en la última posición del DNI introducido es la misma que la de la variable "letraCorrecta"
            return true;                     //Se devuelve verdadero
        }
        else return false;                   //De lo contrario, devuelve falso
    }
}



