package com.interview.algorithm.chaine;

import java.util.Arrays;

public class MainIsTwin {

    public static void main(String[] args) {
        System.out.println( "Result = " + isTwin("Marion","Romain"));//true
        System.out.println(isTwin("acb","bca"));//false
        System.out.println(isTwin("hello","world"));//true
        System.out.println(isTwin("Lookout","Outlook"));//true
    }

    private static boolean isTwin(String marion, String romain) {
        boolean result = true;

        char [] marionCharacters = marion.toLowerCase().toCharArray();
        char [] romainCharacters = romain.toLowerCase().toCharArray();
        Arrays.sort(marionCharacters);
        Arrays.sort(romainCharacters);

        return  String.valueOf(marionCharacters).equals(String.valueOf(romainCharacters));

    }
}
