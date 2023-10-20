package com.katacode.Month102023;

public class Kata13102023 {
    public static void main(String[] args) {

        try {
            System.out.println("In Try bloc");
            System.exit(0);
        } catch (Exception e){
            System.out.println("In catch bloc");
        } finally {
            System.out.println("In Finnaly bloc");
        }

        //Output :  //In Try bloc
    }
}
