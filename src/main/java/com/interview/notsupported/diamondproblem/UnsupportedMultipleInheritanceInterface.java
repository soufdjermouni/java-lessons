package com.interview.notsupported.diamondproblem;

interface Parent{
    default void show(){
        System.out.println("Ashow called from Parent");
    }
}

interface A1 extends Parent{
    @Override
    default void show(){
        System.out.println("Ashow called from A ");
    }
}

interface B1 extends Parent{
    @Override
    default void show(){
        System.out.println("Ashow called from B");
    }

}

//nherits unrelated defaults for show() from types com.interview.notsupported.diamondproblem.A1
// and com.interview.notsupported.diamondproblem.B1
//has to invoke the show() method, Then it will be a ambiguous condition         from where to invoke show() either
// from A or B interface.
public class UnsupportedMultipleInheritanceInterface implements A1, B1 {
    public static void main(String[] args) {
        UnsupportedMultipleInheritance obj = new UnsupportedMultipleInheritance();
        obj.display();
    }

    //Solution : How to resolve DAIMOND problem?
     @Override
     public void show(){
         B1.super.show();
     }
}
