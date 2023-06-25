package com.version.java12;

public class SwitchJava12 {

    public static void main(String[] args) {

        System.out.println(getTextViaArrow(2));
        System.out.println(getTextViaArrow(4));
        System.out.println(getTextViaArrow(4));
    }

    private static String getTextViaArrow(int number) {

        String result = switch (number) {
            case 1,2 -> "one or two";
            case 3 -> "three";
            case 4,5,6 -> "four or five or six";
            default -> "unknown";
        };
        return  result;
    }
}
