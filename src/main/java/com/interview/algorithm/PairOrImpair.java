package com.interview.algorithm;

import java.util.Scanner;

public class PairOrImpair {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " est un nombre pair.");
        } else {
            System.out.println(number + " est un nombre impair.");
        }
    }
}
