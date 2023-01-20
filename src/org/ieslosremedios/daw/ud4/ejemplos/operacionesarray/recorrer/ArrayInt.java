package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.recorrer;


public class ArrayInt {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10,}; //30
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //55

        System.out.println(sumarArray(a));
        System.out.println(sumarArray(a) + sumarArray(b));

        System.out.println(foreachSumarArray(a));
        System.out.println(foreachSumarArray(a) + foreachSumarArray(b));

    }

    public static int sumarArray(int[] a) {
        int sumatotal = 0;
        for (int i = 0; i < a.length; i++) {
            sumatotal += a[i];
        }
        return(sumatotal);
    }

    public static int foreachSumarArray(int[] a){
        int sumatotal = 0;
        for (Integer e:a) {
            sumatotal += e;
        }
        return(sumatotal);
    }
}

