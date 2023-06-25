package com.lessons.string;

public class ExampleTrim {

    public static void main(String[] args) {

        String str = "   hello World ";
        System.out.println(str.length());
        String str2 = str.trim();
        System.out.println(str2.length());
        String str3 = str.strip();
        System.out.println(str3.length());

        System.out.println("-------------");
        String s = "   hello world  \u2000";
        String trimmed = s.trim();
        System.out.println(trimmed); // "hello world   "
        System.out.println(trimmed.length()); //14

        String stripped = s.strip();
        System.out.println(stripped); // "hello world"
        System.out.println(stripped.length()); //11
    }
}
