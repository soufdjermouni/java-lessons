package com.lessons.generics;

public class GenricsMethod {

    public static void main(String[] args) {
        System.out.println(compare(Integer.valueOf(3), Integer.valueOf(2)));
        System.out.println(compare(Double.valueOf(3), Double.valueOf(2)));
        System.out.println(compare(String.valueOf("A"), String.valueOf("B")));
    }

    public static <T extends Comparable<T>> int compare(T object1, T object2) {
        return object1.compareTo(object2);
    }
}
