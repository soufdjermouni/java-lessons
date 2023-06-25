package com.interview.exception;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        try
        {
            System.out.print("Hello" + " " + 1 / 0);
        }catch(Exception ex){
            System.out.print("Java"+" ");

        }
        //Exception 'java.lang.ArithmeticException' has already been caught
        /*catch(ArithmeticException e)
        {
            System.out.print("World");
        }*/
    }
}
