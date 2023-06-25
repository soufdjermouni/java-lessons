package com.lessons.generics.box;

public class MainBoxGenerics {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setContent("hello, Generics!");
        String content = stringBox.getContent();//no explicit casting need
        System.out.println(content);//hello, Generics!
    }
}
