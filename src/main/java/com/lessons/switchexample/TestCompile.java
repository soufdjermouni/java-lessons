package com.lessons.switchexample;

public class TestCompile {

    public static void main(String[] args) {

        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.hashCode()"
        // because "<local2>" is null
        String str = null;
        switch (str) {
            case "null":
                System.out.println("null string");
                break;
        }
    }
}
