package org.ieslosremedios.daw.ud6.ejercicios.actividad6_1;

public class caracterEn {
    public static void main(String[] args) {

        try{
            System.out.println(caracterEn("Perro", 0));
            System.out.println(caracterEn("Santificación", 8));
            System.out.println(caracterEn("Otorrinolaringólogo", 1));
            System.out.println(caracterEn("Desoxirribonucleótido", 20));
        }
        catch (Exception oobe){
            System.out.println(oobe.getMessage());
        }
    }


    private static char caracterEn(String palabra, int posicion) throws Exception{
        if (posicion < 0 || posicion >= palabra.length())
        {
            throw new Exception("Posición introducida no válida, introduce una posición desde 0 hasta la longitud de la palabra -1") ;
        }
        else return palabra.charAt(posicion);
    }


}
