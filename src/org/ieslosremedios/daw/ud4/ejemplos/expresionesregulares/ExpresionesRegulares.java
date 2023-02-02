package org.ieslosremedios.daw.ud4.ejemplos.expresionesregulares;
import java.util.regex.Matcher; //Importamos esta clase que checará los patrones
import java.util.regex.Pattern; //Importamos esta clase que creará patrones

public class ExpresionesRegulares {
    public static void main(String[] args) {
        Pattern p = Pattern.compile( "(?i)^Pa.*"); //El patrón indica que buscará que empiece por "Pa" y que le siga
                                                         //cualquier combinación de letras, (?i) es una expresión que
                                                         //indica que ignore mayúsculas y minúsculas
        Matcher m = p.matcher("patata"); //Buscamos la palabra "patata" como empieza por "pa" tendrá que encontrar
        System.out.println(m.matches()); //Esto devolverá "true"


        String s = "Hola me llamo Jonathan";  //Creamos un String
        String[] partido = s.split(" "); //Creamos un array que contendrá cada palabra del String s
                                               //esto lo hace con el método "split()", el cual indica a partir de que
                                               //símbolo se va a separar, por ejemplo si ponemos "" separaría cada letra

        for (int i = 0; i < partido.length; i++){
            System.out.print(partido[i] + " ");
        }

//        String palabra1 = partido[0];
//        String palabra2 = partido[1];
//        String palabra3 = partido[2];
//        String palabra4 = partido[3];
//        System.out.println(palabra1 + " " + palabra2 + " " + palabra3 + " " + palabra4);

    }
}
