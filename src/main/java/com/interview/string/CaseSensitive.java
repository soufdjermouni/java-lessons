package com.interview.string;

public class CaseSensitive {

    public static void main(String[] args) {
        String s1 = new String ("java");
        String s2 = new String ("JAVA");

        //Value of s2 will be assigned to s1 variable and that will be printed (JAVA) as "=" is an assignment operator not a comparison operator.
        System.out.println(s1 = s2);

        //Because the == operator compares between s11 and s22, and find that they are different strings, so the output will be False
        String s11 = new String ("java");
        String s22 = new String ("JAVA");
        System.out.println(s11 == s22);
    }
}
