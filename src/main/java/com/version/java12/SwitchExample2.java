package com.version.java12;


import java.time.Month;

public class SwitchExample2 {

    public static void main(String[] args) {

       Month month = Month.JANUARY;
        int state = switch (month){
            case JANUARY -> 0;
            case FEBRUARY -> 1;
            case MARCH -> 2;
            default -> {
                int l = logic(month);
                l=9;
                yield  l;  //retrun is incrrect
            }
        };

        String etat = "UP";
        int number = switch (etat) {
            case "UP":
              //  return 5; //Return outside of enclosing switch expression
                yield 5;
            case "DWON":
              //  return 7; //Return outside of enclosing switch expression
            yield 7;

            default:
                System.out.println("Illgegal");
               // return -1; //Return outside of enclosing switch expression
                yield -1;
        };


    }

    private static int logic(Month month) {
        return 9;
    }


}
