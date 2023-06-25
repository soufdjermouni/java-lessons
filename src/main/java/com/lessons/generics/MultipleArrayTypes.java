package com.lessons.generics;

public class MultipleArrayTypes {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] stringArray = { "Java", "is", "cool" };

        System.out.print("intArray: ");
        printArray(intArray);

        System.out.print("doubleArray: ");
        printArray(doubleArray);

        System.out.print("stringArray: ");
        printArray(stringArray);
    }
}
