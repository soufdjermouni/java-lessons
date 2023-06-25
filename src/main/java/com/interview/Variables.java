package com.interview;

public class Variables {

    static int x=11;
    private int y=33;

    public static void main(String[] args) {
        Variables pro = new Variables();
        pro.method(5);
        System.out.println(Variables.x);//11 , La variable static ne change pas
        System.out.println(pro.x);//11
        System.out.println(pro.y);//12
    }

    public void method(int x) {
        x=10;
        y=12;
    }
}

