package com.interview.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexExapple {

    public static void main(String[] args) {

        String input = "Le Chat dort sur le tapis.";

        String regex = "C.*t?";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Motif trouvé : " + matcher.group());
        }
    }
}
