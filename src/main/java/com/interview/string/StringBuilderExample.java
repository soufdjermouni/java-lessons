package com.interview.string;

public class StringBuilderExample {


    public static void main(String[] args) {

        String str = "level";
        StringBuilder sb= new StringBuilder(str);

        System.out.println(str);
        System.out.println(sb.reverse());

        if(str.equals(sb.reverse()))
            sb.append(sb);
        System.out.println(sb.length());//5

        if(str.equals(sb.reverse().toString()))
            sb.append(sb);
        System.out.println(sb.length());//10
    }
}
