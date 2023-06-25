package com.interview.inheritance;

//contrat à implémenter
interface A {void methodA();}
//contrat à implémenter
interface B {void methodB();}
class MyClass implements  A,B {
    @Override
    public void methodA(){
        System.out.println("Method A");
    }
    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}

public class MultipleInheritance  {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
