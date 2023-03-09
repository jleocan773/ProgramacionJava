package org.ieslosremedios.daw.ud6.ejemplos.excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Try {
    public static void main(String[] args) {
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");
        try{
            lector("hola.txt");
//            Ejemplo para método DIVIDIR
//            int dividendo = 5;
//            int divisor = 0;
//            System.out.println("Resultado: " + dividir(dividendo, divisor));
//        Si ponemos una excepción más general como "Exception" funcionaría, pero es mejor dar fallos específicos que otros
//          más abiertos y que den menos información, así que es mejor usar ArithmeticException
//        } catch (Exception ex){
//            System.out.println("No se puede dividir por 0");
        }
        catch (ArithmeticException s) {
            System.out.println("Imposible dividir por 0");
            s.printStackTrace();
            s.getMessage();
        } catch (FileNotFoundException n){
            n.printStackTrace();
        } catch (IOException n){
            n.printStackTrace();
        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }


    }

    private static int dividir(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }

    private static void lector (String filepath) throws IOException{
        FileReader fileReader = new FileReader(filepath);
        System.out.println(fileReader.read());
        fileReader.close();
    }
}
