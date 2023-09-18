package com.lessons.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionCheckedVsUnchecked {

    public static void main(String[] args) throws FileNotFoundException {

        // Checked Exception  : FileNotFoundException
        readFile("myFile.txt");

        //unchecked exception  : NullPointerException
        String name = null;
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "myString" is null
        printLenth(name);
    }

    private static void printLenth(String myString) {
        System.out.println(myString.length()); // Exception NullPointerException si string is Null
    }

    private static void readFile(String fileName) throws FileNotFoundException {
            FileReader reader = new FileReader(fileName);
    }
}
