package com.interview.algorithm.chaine;

public class ChainePlusLongue {

    public static void main(String[] args) {
        String [] str = new String [] {"chien", "chat", "éléphant", "souris"};
        String result = str[0];
        for (int i = 1; i < str.length; i++) {
            if(str[i].length() > result.length() )  {
                result = str[i];
            }
        }
        System.out.println(result);
    }
}
