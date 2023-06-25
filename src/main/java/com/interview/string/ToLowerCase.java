package com.interview.string;

import java.util.Locale;

public class ToLowerCase {

    public static void main(String[] args) {

        String txt = "Hello World";
        System.out.println(txt.toLowerCase());
        //OUTPUT : hello world Because the java string toLowerCase() method returns the string in lowercase letter. In other words,
        // it converts all characters of the string into lower case letter.
        //The toLowerCase() method works same as toLowerCase(Locale.getDefault()) method. It internally uses the default locale.
        System.out.println(txt.toLowerCase(Locale.getDefault()));
    }
}
