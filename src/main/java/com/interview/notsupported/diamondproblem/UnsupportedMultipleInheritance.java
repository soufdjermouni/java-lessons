package com.interview.notsupported.diamondproblem;

class A{
    void display(){
        System.out.println("A -> display() called");
    }
}

class B{
    void display(){
        System.out.println("B -> display() called");
    }
}

//What Java does not allow is multiple inheritance where one class can inherit properties from more than one class.
// It is known as the diamond problem
public class UnsupportedMultipleInheritance extends A
        //, B : Class cannot extend multiple classes
         {
    public static void main(String[] args) {
        UnsupportedMultipleInheritance obj = new UnsupportedMultipleInheritance();
        obj.display();
    }
}
