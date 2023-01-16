package org.ieslosremedios.daw.ud4.ejercicios.actividad4_1;

public class Main {
    //1.- Crea un método main
    public static void main(String[] args) {
        //2.- Declara una variable x de tipo int con valor 1

        int x = 1;

        //5.-Haz lo mismo para una variable "s" de tipo String. Tendrás cambiar la declaración del método para que acepte un parámetro int y otro String.
        // ¿Serías capaz de hacerlo mediante sobrecarga en lugar de modificando el método? (principio de programación: open-close).
        // Comprueba igualmente si el valor de "s" cambia después de invocar el método. Lo que hará el método con el parámetro de tipo String será ponerlo en mayúsculas.

        String s = "Hola";

        //6.- Ahora vamos a incluir como parámetro una variable a de tipo array unidimensional de elementos tipo Double inicializada a los valores que  desemos.
        // Probamos igualmente si cambia tras la invocación del método o no. El cambio que realizará el método sobre el parámetro tipo array será el de incrementar
        // en 1 las posiciones primera (no la 1, sino la primera), última y la que ocupe la posición de en medio (redondeando hacia abajo. p.ej. Si tiene 4
        // posiciones la de en medio será la segunda).

        Double[] arrayDouble = {1.32d,2.51d,34.56d,40.20d,10.50d};

        //4.- Invoca el método "m" desde main enviando "x" como argumento. Comprueba si la variable "x" cambia de valor después de ejecutar el método. Para eso
        //puedes imprimir las variables antes de invocar al método y después.

        System.out.println("-------------------------------------------");
        System.out.println("Variables antes de ejecutar los métodos: ");
        System.out.println(x);
        System.out.println(s);
        System.out.println(arrayDouble[0]);
        System.out.println(arrayDouble[2]);
        System.out.println(arrayDouble[4]);
        System.out.println("-------------------------------------------");


        System.out.println("-------------------------------------------");
        System.out.println("Variables después de ejecutar los métodos: ");
        m(x); //Ejecutamos el método que debería de sumar uno (1) al valor de x
        m(x,s); //Ejecutamos el método que debería de poner el String en Mayúsculas
        System.out.println(x); //El valor no cambia
        System.out.println(s); //El valor no cambia
        m(arrayDouble, 2); //Ejecutamos el método que creará un array bidimensional <--- Esto funciona regular
        m(x,s, arrayDouble); //Ejecutamos el método que suma uno (1) al primer, último y la posición intermedia del array
        System.out.println(arrayDouble[0]); //Como hemos explicado abajo, el valor cambia, porque se ha sustituido
        System.out.println(arrayDouble[2]); //Como hemos explicado abajo, el valor cambia, porque se ha sustituido
        System.out.println(arrayDouble[4]); //Como hemos explicado abajo, el valor cambia, porque se ha sustituido
        System.out.println("-------------------------------------------");

    }

    //3.- Crea un método "m" que no devuelva nada y reciba un parámetro de nombre x y tipo int. El método incrementará en una unidad el valor del parámetro.
    public static void m(int x){
        x = x + 1;
    };

    public static void m(int x, String s){
        s = (s.toUpperCase());
    }

    public static void m(int x, String s, Double[] arrayDouble){
        arrayDouble[0] = (arrayDouble[0] + 1); //Al ejecutar esto, se va a pasar una copia de la referencia de arrayDouble[0], y esta sustituirá a la original
        arrayDouble[2] = (arrayDouble[2] + 1); //Al ejecutar esto, se va a pasar una copia de la referencia de arrayDouble[2], y esta sustituirá a la original
        arrayDouble[4] = (arrayDouble[4] + 1); //Al ejecutar esto, se va a pasar una copia de la referencia de arrayDouble[4], y esta sustituirá a la original
    }

    // 7.- Cambiamos el método (¿o seguimos sobrecargando?) para que devuelva un array bidimensional de tipo int, formando una matriz de N x M, donde N ese el
    // tamaño del array de Doubles del parámetro de entrada y M es igual a 2. Vamos a copiar el array de entrada al de salida: para cada posición del array de
    // salida guardaremos primero la parte entera correspondiente a la misma posición del array de entrada y la parte decimal después.
    public static void m(Double[] arrayDouble, int n){
        int arrayInt [][] = new int [arrayDouble.length] [n];

        //Para quedarme con la parte entera y decimal para construir los arrays voy a hacer lo siguiente*
        //Si divido un número decimal entre 1, el resultado será la parte decimal, la cual guardaré en una variable "decimalX"
        //Después para conseguir el entero, pillaré el valor en la posición pertinente del array y le restaré la parte decimal, y esto lo guardaré en "enteroX"

        double decimales0 = (arrayDouble[0] % 1);
        int entero0 = (int) (arrayDouble[0] - decimales0);
        double decimales1 = (arrayDouble[1] % 1);
        int entero1 = (int) (arrayDouble[1] - decimales1);
        double decimales2 = (arrayDouble[2] % 1);
        int entero2 = (int) (arrayDouble[2] - decimales2);
        double decimales3 = (arrayDouble[3] % 1);
        int entero3 = (int) (arrayDouble[3] - decimales3);
        double decimales4 = (arrayDouble[4] % 1);
        int entero4 = (int) (arrayDouble[4] - decimales4);

        //El entero se muestra correctamente, pero la parte decimal tiene un problema, al ser de tipo "int" el array que hemos creado, no podrá guardar valores
        //decimales, así que siempre mostrará cero, esto lo podríamos "circunvalar" si multiplicamos la parte decimal por 100, por ejemplo, si nuestra parte decimal
        //fuese "X.5824678" podríamos multiplicarlo por 100 sin problemas, pero si el decimal es de solo una cifra no nos serviría este método por lo que no es
        //completamente factible, pero no se me ocurre ninguna manera de guardar la parte decimal sin fallo.

        arrayInt[0][0] = entero0;
        arrayInt[0][1] = (int) (decimales0 * 100);
        arrayInt[1][0] = entero1;
        arrayInt[1][1] = (int) (decimales1 * 100);
        arrayInt[2][0] = entero2;
        arrayInt[2][1] = (int) (decimales2 * 100);
        arrayInt[3][0] = entero3;
        arrayInt[3][1] = (int) (decimales3 * 100);
        arrayInt[4][0] = entero4;
        arrayInt[4][1] = (int) (decimales4 * 100);

        System.out.println(arrayInt[3][1]);
    }
}
