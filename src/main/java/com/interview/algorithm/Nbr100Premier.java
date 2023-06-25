package com.interview.algorithm;

public class Nbr100Premier {
    public static void main(String args[]){

        for(int i = 2; i<=100;){
            int premier = 1;
            for(int loop = 2; loop <=i; loop++) {
                if((i % loop) == 0 && loop!=i) {
                    premier = 0;
                }
            }
            if (premier != 0){
                System.out.println(i+" est un nombre premier");
                i++;
            }
            else
                i ++;
        }
    }
}