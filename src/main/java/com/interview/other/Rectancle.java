package com.interview.other;

public class Rectancle {
    public static int count =4;
    public static void main(String[] args) {
        Rectancle rect1 = null;

        //4  : because static variable associated with class.. since object is null but class is loaded with static variable ...
        // so static variable value would be 4 and no exception ...
        System.out.println(rect1.count);
    }
}
