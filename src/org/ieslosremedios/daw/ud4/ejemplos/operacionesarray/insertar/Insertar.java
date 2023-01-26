package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.insertar;

public class Insertar {
    public static void main(String[] args) {
    }

    public static int[] insertar ( int[] in, int e, int pos){

        int[] out = new int[in.length + 1];
        for (int i = 0; i < pos; i++) {
            out[1] = in[1];
        }
            out[pos] = e;
            out[pos + 1] = in[in.length - 1];

            return out;
    }
}

