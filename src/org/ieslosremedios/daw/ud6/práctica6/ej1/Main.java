package org.ieslosremedios.daw.ud6.práctica6.ej1;

public class Main {
    public static void main(String[] args) {
        int dividendo = 6;
        int divisor = 15;
        try {
            int resultado = division(dividendo, divisor);
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
        }
        catch (ExcepcionDelSeis e){
            System.err.println("Error: " + e.getMessage());
            System.err.println("No introduzcas el número 6 ni el divisor ni en el dividendo");
        }
        catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.println("Introduzca un divisor válido");
        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
            System.err.println("Introduzca un divisor válido");
        }

    }
    public static int division(int dividendo, int divisor) throws Exception {
        if (dividendo == 0) {
            throw new ArithmeticException("No se puede dividir cero.");
        }
        else if (dividendo == 0 ) {
            throw new Exception("No se puede dividir entre cero.");
        }
        else if (divisor == 6 || dividendo == 6) {
            throw new ExcepcionDelSeis("No acepto ni que el divisor ni el dividendo sea 6.");
        }
        else {
            return dividendo / divisor;
        }
    }
}
