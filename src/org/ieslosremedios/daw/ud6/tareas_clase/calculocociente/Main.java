package org.ieslosremedios.daw.ud6.tareas_clase.calculocociente;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try{
            calcularCociente(a,b);
        }catch (ArithmeticException arEx){
            arEx.printStackTrace();
            System.out.println("Se ha producido un error");
        }finally {
            System.out.println("Programa Finalizado");
        }
    }

    public static int calcularCociente (int a, int b) throws ArithmeticException{
        return b / a;
    }
}
