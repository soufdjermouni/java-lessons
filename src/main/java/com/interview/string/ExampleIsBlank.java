package com.interview.string;

public class ExampleIsBlank {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "    ";
        String str3 = "Hello world";

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true
        System.out.println(str3.isBlank());//false


        System.out.println("isEmpty espacement : "+str2.isEmpty());//false
    }
}
