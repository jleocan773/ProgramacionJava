package org.ieslosremedios.daw.ud6.ejemplos.recursividad;

public class cuentaAtras {
    public static void main(String[] args) {
    cuentaAtrasRecursiva(10);
    cuentaAtrasIterativa(10);

    }

    private static void cuentaAtrasRecursiva(int i){
        if (i > 0) {
            System.out.println(i);
            cuentaAtrasRecursiva(i-1);
        } else System.out.println("FIN");
    }

    private static void cuentaAtrasIterativa(int i){
        while(i > 0){
            System.out.println(i);
            i--;
        }
        System.out.println("FIN");
    }



}
