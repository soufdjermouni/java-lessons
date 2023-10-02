package com.interview.string;

public class FizzBuzzResteDivision {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println( "pour valeur i="+ i + " chaine= " +printFIzzBuzz(i));//FizzBuzz

        }
    }

    private static String printFIzzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0){
            return  "FizzBuzz";
        } else if(num % 3 ==0) {
            return "Fizz";
        }else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }
    }
}
