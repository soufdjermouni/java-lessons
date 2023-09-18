package com.lessons.innerclass;

public class MainClasseInterne {

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass ic =  outerObj.new InnerClass();

    }
}
