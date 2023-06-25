package com.interview.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringContainsChar {

    public static void main(String[] args) {

        String charKeys = "ae";
        String [] words = {"all","even","root","take","azrt", "ssss","ddddd"};

        List<String> strOfChar = charKeys.chars().
                mapToObj(i -> (char)i).
                map(c -> c.toString()).
                collect(Collectors.toList());


        List<String> result = new ArrayList<>();
       for (String word: words){
           strOfChar.stream().forEach(
                   e -> {
                       if (word.contains(e)) {
                           if(!result.contains(word)) {
                               result.add(word);
                           }
                       }
                        });

       }
        String [] wordsnew = result.stream().toArray(String[]::new);
        System.out.println(result);
    }

    public boolean contains(String str, char chr ) {
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == chr)
                return true;
        return false;
    }


}
