package com.interview.algorithm;

import java.util.Scanner;

public class SuiteFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier positif: ");
        int n = sc.nextInt();

        System.out.println("Les " + n + " premiers termes de la suite de Fibonacci sont:");
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a=b;
            b=c;
        }

    }
}
