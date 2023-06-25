package com.lessons.polymorphism.method;

public class John {

    private String name;
    private String surname;
    private int age;

    public John() {}

    public John(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public John(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void sayHello(String name){
        System.out.println("Hello, I'm " + name);
    }
    public void sayHello(String name, int age){
        System.out.println("Hello, I'm " + name + ", and I'm " + age + "year(s) old.");
    }

    //However, we could not add the following method:
    /*private void sayHello(String surname){
        System.out.println("Hello, I'm " + surname);
    }*/
}


