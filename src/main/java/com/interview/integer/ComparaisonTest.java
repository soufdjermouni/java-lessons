package com.interview.integer;

/**
 * En Java, int est considéré comme un type de données primitif utilisé pour stocker des valeurs numériques et prend 4
 * octets pour stocker des données en mémoire
 *
 * Integer objects in the range -128 to 127.
 *
 *  Exemple en bas :
 *  i1 and i2 are outside of the cached range
 *
 */
public class ComparaisonTest {

    public static void main(String[] args) {

        // Integer cache value from -128 to 127. And outside create objects
        Integer i1 = 128;
        Integer i2 = 128;

        Integer i3 = -128;
        Integer i4 = -128;

        System.out.println((i1 == i2) + ", " + (i3 == i4)); //false, true
    }
}
