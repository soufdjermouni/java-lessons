package com.interview.codinggame.nextinteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextIntegerSolKarim {
    public static int next(int n){
        String numbers = String.valueOf(n);
        List<Integer> digits = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> digitsToUse = new ArrayList<>();
        Integer leftDigit = Character.getNumericValue(numbers.charAt(0));
        StringBuilder outputBuilder = new StringBuilder();
        Integer lowestToUse = 0;

        for(Integer i : digits){
            if (!numbers.contains(i.toString())){
                digitsToUse.add(i);
            }
        }

        digitsToUse = digitsToUse.stream().sorted().toList();

        for(Integer i : digitsToUse){
            if (i >leftDigit){
                lowestToUse = i;
                break;
            }
        }
        if (lowestToUse == 0 ){

            outputBuilder.append(digitsToUse.get(1));

            for (int i=0;i<numbers.length();i++){
                outputBuilder.append(digitsToUse.get(0));
            }
        }else{

            outputBuilder.append(lowestToUse);
            for (int i=0;i<numbers.length()-1;i++){
                outputBuilder.append(digitsToUse.get(0));
            }
        }
        return Integer.valueOf(outputBuilder.toString());
    }
    public static void main(String[] args) {
        System.out.println(next(2)); // 3
        System.out.println("Next integer with distinct digits: " + next(2)); //3
        System.out.println("Next integer with distinct digits: " + next(54)); //60
        System.out.println("Next integer with distinct digits: " + next(901)); //2222
        System.out.println("Next integer with distinct digits: " + next(958)); //1000
        System.out.println("Next integer with distinct digits: " + next(3025)); //4111
        System.out.println("Next integer with distinct digits: " + next(654321)); //700000
    }
}
