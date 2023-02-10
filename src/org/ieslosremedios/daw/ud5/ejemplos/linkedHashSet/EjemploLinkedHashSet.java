package org.ieslosremedios.daw.ud5.ejemplos.linkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {
        // 1.- Crea un Conjunto Vacío de Cadenas
        Set<String> linkedHashSet = new java.util.LinkedHashSet<>();

        //2.- Agrega los nombres de varios alumnos
        String s1 = "Paco";
        String s2 = "Roberto";
        String s3 = "Luis";
        String s4 = "Francisco";
        String s5 = "Carlos";

        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);
        linkedHashSet.add(s4);
        linkedHashSet.add(s5);

        //3.- Imprime el conjunto para ver su contenido, ¿imprime valor o referencia? -→ Imprime el valor
        System.out.println(linkedHashSet);

        //4.- Añade un nombre repetido, ¿permite duplicados? -→ No permite duplicados
        linkedHashSet.add(s1);
        System.out.println(linkedHashSet);

        //5.- Añade un null, ¿permite nulos? -→ Sí, permite nulos
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        //6.- Recorre el conjunto imprimiendo cada uno de sus elementos en orden, del primero que fue insertado al
        //último. Compara con el orden que tendría HashSet -→ HashSet no tendría orden, mientras que linkedHashSet sí

        Iterator<String> it = linkedHashSet.iterator();
        String e;
        System.out.print("linkedHashSet recorrido: ");
        while(it.hasNext()){
            e = it.next();
            System.out.print(e + " ");
        }

        Set<String> hashSet = new HashSet<>();

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);

        Iterator<String> it1 = hashSet.iterator();
        String e1;
        System.out.print("\nhashSet recorrido: ");
        while(it1.hasNext()){
            e1 = it1.next();
            System.out.print(e1 + " ");
        }

    }
}
