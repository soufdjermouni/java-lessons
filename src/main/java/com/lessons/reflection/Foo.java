package com.lessons.reflection;

public class Foo {
    private String name;

    public Foo (String name){
      this.name = name;
    }
    public String hello() {
        System.out.println(name);
        return this.name;
    }
}
