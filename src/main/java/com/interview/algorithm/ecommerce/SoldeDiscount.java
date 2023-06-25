package com.interview.algorithm.ecommerce;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class SoldeDiscount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int discount = in.nextInt();
        int n = in.nextInt();
        int [] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i]=in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int price = calculateTotalPrice(prices, discount) ;
        int price2 = calculateTotalPriceOld(prices, discount) ;
        System.setOut(outStream);
        System.out.println(price);
        System.out.println("price2 = "+price2);

    }

    private static int calculateTotalPrice(int[] prices, int discount) {
        int max = Arrays.stream(prices).max().getAsInt();
        int total = Arrays.stream(prices).sum();
        return (int) Math.floor(total -( max*discount/100f));
    }

    private static int calculateTotalPriceOld(int[] prices, int discount) {
        int result = 0;
        Arrays.stream(prices).sorted();
        int pricePlusCher = Arrays.stream(prices).max().getAsInt();
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]==pricePlusCher) {
                int reduc = prices[i] - (prices[i] *discount )/ 100;
                sum = sum+ reduc;
            } else {
                sum+=prices[i];
            }
        }
        return sum;
    }
}
