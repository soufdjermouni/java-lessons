package com.lessons.generics;

import java.util.Arrays;
import java.util.Collection;

public class GenericsMethodStatic {

    public static <T> void manipulo() {
        T thingy = (T) "Oy, gevalt";
        System.out.printf("Unchecked cast to T: %s", thingy);
    }

    public static int countElements(Collection<?> collection) {
        int count = 0;
        for (Object obj : collection) {
            count++;
        }
        return count;
    }

    public static void main(String... args) {
        GenericsMethodStatic.<CharSequence> manipulo();
        System.out.println();
        System.out.println("size= " + countElements(Arrays.asList("e1", "e2", "e3")));//3
    }
}
