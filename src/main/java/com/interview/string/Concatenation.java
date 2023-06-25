package com.interview.string;

public class Concatenation {

    public static void main(String[] args) {
        String name = "Ritchie";
        String lastName = " Blackmore";

        String completeNameWithOperator = name + lastName;
        String completeNameWithConcat = name.concat(lastName);

        System.out.println("Complete name using the + sign operator: " + completeNameWithOperator);
        System.out.println("Complete name using the concat method: " + completeNameWithConcat);

        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(completeNameWithOperator));


        //JVM creates two new Strings for each loop counter: One created by the concat(",") method call. and Another created by the concat(String.valueOf(i)) method call.
        //ne pas utiliser concat et + dans des loops, utiliser dans ce cas :  StringBuilder  ou SringBuffer
        //We manipulate that array using the append method to add more text and the toString method to transform it into a String.
        // Let's use the code below to show how to use StringBuilder methods:
        String numberSequence = "";
        for (int i = 0; i < 1000; i++) {
            numberSequence = numberSequence.concat(",").concat(String.valueOf(i));
        }
        System.out.println(numberSequence);

        //public StringBuilder append(Object obj) | public synchronized StringBuffer append(Object obj)
        //All methods in StringBuffer are synchronized. So, if two threads write in the same String at the same time, we can guarantee that
        // StringBuffer will keep the numbers in order. Using StringBuilder in multi-threaded environments
        // , we can't guarantee the order of the number sequence.

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(",").append(i); //Here, the JVM creates only one StringBuilder and one String.
        }
        System.out.println(builder.toString());
    }
}
