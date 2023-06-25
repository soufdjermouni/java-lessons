package com.katacode;

public class Kata1SommeStringEntier {

    public static void main(String[] args) {
        System.out.println("12" + 1 + 3); //1213
        System.out.println(12 + "12" + 1 + 3); //121213
        System.out.println(12 + 12 + 1 + 3); //28

        String str = null;
        switch (str) { //NullPointerException
            case "null":
                System.out.println("null string");
                break;
        }
    }
}
