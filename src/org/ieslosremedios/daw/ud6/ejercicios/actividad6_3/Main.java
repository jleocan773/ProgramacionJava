package org.ieslosremedios.daw.ud6.ejercicios.actividad6_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Aquí hay 6 números, el número más grande es 142
        Integer [] numeros = {10, 12, 9, 54, 102, 142};
        //Aquí hay 500 números, el número más grande es 2499
        Integer [] masnumeros = {835, 1139, 1045, 1399, 1651, 1902, 695, 96, 1871, 1621, 1932, 1831, 958, 2041, 641, 99, 1983, 795, 1811, 306, 1745, 814, 322, 2214, 114, 554, 412, 1434, 443, 1310, 648, 504, 2112, 1280, 889, 140, 1165, 1167, 1157, 2385, 1270, 1076, 499, 1292, 1928, 1150, 882, 1575, 250, 2427, 790, 1674, 1520, 1791, 1957, 266, 809, 655, 1616, 420, 1522, 1365, 1181, 1784, 1926, 2198, 2493, 2017, 516, 1326, 2499, 846, 1701, 2117, 2484, 2141, 2190, 484, 353, 111, 1552, 1736, 930, 2376, 447, 1298, 464, 100, 879, 670, 1266, 1746, 1195, 1519, 1249, 2465, 1375, 1644, 203, 1691, 1525, 2142, 339, 791, 1265, 1544, 1664, 2347, 1513, 355, 716, 645, 50, 24, 1473, 658, 445, 1832, 1059, 2121, 2127, 413, 1126, 551, 1543, 2199, 514, 2220, 966, 766, 642, 934, 343, 1562, 75, 1533, 947, 1567, 636, 1724, 160, 2289, 743, 806, 232, 1976, 880, 1578, 290, 1751, 1129, 2008, 2131, 2269, 661, 474, 117, 2309, 1364, 2317, 1474, 1968, 224, 312, 996, 265, 122, 2174, 2250, 756, 1945, 1324, 920, 1726, 1348, 971, 2419, 1023, 1295, 1669, 336, 672, 849, 1869, 410, 1549, 711, 800, 1838, 1484, 1353, 649, 2328, 1341, 1439, 2494, 764, 2319, 149, 533, 101, 2156, 2356, 596, 1931, 2101, 2437, 1905, 785, 369, 1398, 2204, 2468, 1470, 2119, 2257, 2383, 2171, 746, 214, 478, 1465, 1464, 513, 296, 1967, 926, 1936, 1219, 1500, 858, 1563, 1488, 2263, 2096, 1187, 2052, 1639, 1285, 1814, 839, 1441, 222, 248, 1173, 2384, 2348, 888, 563, 1442, 1472, 1740, 2352, 1821, 777, 2029, 1712, 2054, 961, 1540, 1696, 2231, 2163, 1468, 2422, 2221, 1025, 2036, 1275, 462, 488, 450, 2336, 1987, 1580, 823, 76, 546, 1377, 2135, 501, 1818, 828, 665, 1584, 1679, 578, 2123, 1033, 2425, 869, 1233, 1185, 523, 1134, 11, 2247, 1685, 1979, 560, 2224, 328, 1861, 1867, 1731, 2292, 571, 167, 481, 56, 569, 951, 2277, 2225, 1702, 686, 190, 1486, 617, 1123, 152, 1374, 1406, 1054, 446, 466, 511, 1916, 1883, 2337, 249, 1772, 2000, 2004, 2180, 440, 9, 1785, 273, 1193, 1156, 2182, 1542, 133, 221, 1153, 2441, 1963, 1925, 1837, 1971, 1529, 1390, 1410, 1994, 199, 1027, 1414, 302, 144, 614, 1953, 1647, 561, 1993, 612, 937, 968, 505, 188, 1787, 1950, 452, 1911, 776, 722, 2372, 1590, 1155, 1778, 52, 2496, 157, 830, 1053, 893, 251, 1131, 1750, 1304, 755, 1492, 2085, 1623, 1845, 1641, 570, 1152, 380, 923, 843, 1559, 1206, 1281, 1214, 189, 367, 1688, 2241, 567, 2203, 1796, 510, 44, 77, 1437, 2045, 562, 500, 330, 590, 147, 1613, 983, 1044, 2016, 1631, 1080, 1307, 2014, 2084, 229, 2486, 518, 773, 2099, 965, 178, 1625, 1164, 900, 611, 331, 829, 1842, 0, 1635, 697, 1047, 1677, 97, 2283, 82, 287, 1718, 2349, 2118, 2125, 2019, 1154, 1915, 180, 1878, 172, 587, 1940, 2126, 528, 1087, 909, 2086, 770, 616, 1694, 2145, 1632, 150, 2186, 483, 58, 2475, 1457, 2460, 731, 1692, 455, 1789, 2324, 2457, 2424, 2274, 637, 2379, 259, 2129, 404, 529, 1378, 862, 361};
        //Hecho con el TreeSet
        //System.out.println(numeroMasGrandeConjunto(numeros));
        //Hecho con un Bucle para el Array
        System.out.println("El número más grande del array " + Arrays.toString(numeros) + " es: ");
        System.out.println(numeroMasGrandeArray(numeros));
        System.out.println("El número más grande del array " + Arrays.toString(masnumeros) + " es: ");
        System.out.println(numeroMasGrandeArray(masnumeros));

    }

    // Ejercicio 1
    //Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande

//    private static int numeroMasGrandeConjunto(Integer [] numeros){
//        List<Integer> listaNumeros = Arrays.stream(numeros).toList();
//        TreeSet conjuntoNumeros = new TreeSet<Integer>(listaNumeros);
//        return (int) conjuntoNumeros.last();
//    }


    // Ejercicio 1
    //Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande

    private static int numeroMasGrandeArray(Integer [] numeros){
        int numMayor = 1;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > numMayor){
                numMayor = numeros[i];
            }
        }
        return numMayor;
    }

//    Ejercicio 2
//    A continuación, analiza la complejidad del algoritmo anterior utilizando la notación big-O.

/*
          private static int numeroMasGrandeArray(Integer [] numeros){
        int numMayor = 1;                                           O(1)
        for(int i = 0; i < numeros.length; i++){                    O(n)
            if(numeros[i] > numMayor){                              0(n)
                numMayor = numeros[i];                              0(n)
            }
        }
        return numMayor;                                            0(1)
    }

        0(2) + 3 0(n) = 0(n)
        La complejidad de este algoritmo es de 0(n)
 */

// Ejercicio 3
//¿Crees que influye la cantidad de números del conjunto en el tiempo que tardará tu
//algoritmo en resolver el problema? ¿Podrías indicar cuál es el caso más favorable y el peor
//caso?

/*

    Yo diría que sí porque si aumenta el número de iteraciones que tiene que realizar un bucle tendrá que aumentar también el tiempo que le lleva al programa en
    realizar esas iteraciones. En este caso cuanto menor sea la longitud del array, menos durará el programa.

    Dicho esto Intellij me tarda lo mismo en recorrer un array de longitud 6 que de longitud 500, así que no sé que conclusión sacar



* */


/*
    Ejercicio 4 (Opcional)
    Intenta averiguar qué hace el siguiente algoritmo:

    public static void misterioso(Integer[] array){
        for (int i = 0; i < array.length - 1; i++){
            int indiceMenor = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < array[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int temp = array[i];
            array[i] = array[indiceMenor];
            array[indiceMenor] = temp;
        }
    }

  Lo que hace este método es ordenar el array de menor a mayor, es decir, hace una selección de los números y los va ordenando


  Después analiza su complejidad.

     public static void misterioso(Integer[] array){
        for (int i = 0; i < array.length - 1; i++){                     O(n)
            int indiceMenor = i;                                        O(n)
            for (int j = i + 1; j < array.length; j++){                 O(n²)
                if(array[j] < array[indiceMenor]){                      O(n²)
                    indiceMenor = j;                                    O(n²)
                }
            }
            int temp = array[i];                                        O(n)
            array[i] = array[indiceMenor];                              O(n)
            array[indiceMenor] = temp;                                  O(n)
        }
    }
*/

    //3 O(n²) + 5 O(n) = 0(n²)
    //La complejidad de este algoritmo es de 0(n²)

}
