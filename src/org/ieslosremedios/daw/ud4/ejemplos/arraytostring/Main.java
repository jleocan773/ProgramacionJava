package org.ieslosremedios.daw.ud4.ejemplos.arraytostring;

public class Main {
    public static void main(String[] args) {

        char[] letras = {'c','a'};
        String c = new String(letras);


        String s = "Hola";
        String s1 = new String("Hola");
        String s2 = new String(new char[] {'H','o','l','a'});
        String s3 = s + " Jonathan";
        s3 = s;

        System.out.println(c);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        imprimeLongitudCadena("HolaBuenas");
        caracterEnPosicionEmpezandoEn(s, 0);

    }

    //TODO Imprimir la longitud de una cadena
    private static void imprimeLongitudCadena (String s){
        System.out.println("La longitud de la cadena " + s + " es de " + s.length());
    }

    //TODO Carácter en Posición empezando en 1 (uno)
    private static void caracterEnPosicionEmpezandoEn (String s, int i){
        System.out.println("El carácter en la posición " + i + " de " + s + " es " + s.charAt(i));
        }


    //TODO Cuenta ocurrencias de un carácter
    private static void ocurrenciasDeUnCaracter (String s){
            
    }

    //TODO Imprime cadenas en orden alfabético las cadenas dadas por un array de cadenas
    //TODO Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que cada vez que aparezca el carácter punto (.)
    // se corte esa frase y se meta en una posición del array y que todas las vocales se sustituyan por el número gráficamente más parecido
    // o --> 0 | i --> 1 | a --> 4 | e --> 3 | u --> 8
}

