package com.lessons.string;

public class StringIsEmpty {

    public static void main(String[] args) {
        String str = "";
        String str2 = " ";
        System.out.println(str.isEmpty());//true
        System.out.println(str2.isEmpty()); //false

        System.out.println(isBlankString(str2));//true

    }

    static boolean  isBlankString(String string) {
        return string == null || string.trim().isEmpty(); //equivalent à string.isBlank();
    }
}
