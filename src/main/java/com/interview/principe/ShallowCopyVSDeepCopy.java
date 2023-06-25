package com.interview.principe;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class ShallowCopyVSDeepCopy {

    public static void main(String[] args) {

        OriginalObject originalObject =   OriginalObject.builder().a(1).b(2).c(3).build();
        OriginalObject copyObjet = originalObject;

        //This code shows a shallow copy:
        System.out.println(originalObject.getA());//1
        System.out.println(copyObjet.getA());//1
        originalObject.setA(4);
        System.out.println(originalObject.getA());//4
        System.out.println(copyObjet.getA());//4


        //This code shows a deep copy:
        System.out.println("This code shows a deep copy");
        OriginalObject copyObjet2 = new OriginalObject(originalObject.getA()
                ,originalObject.getB(),originalObject.getC());
        System.out.println(originalObject.getA());//4
        System.out.println(copyObjet2.getA());//4
        originalObject.setA(9);
        System.out.println(originalObject.getA());//9
        System.out.println(copyObjet2.getA());//4
    }
}

@Getter
@Setter
@Builder
 class OriginalObject {
        int a ;
        int b;
        int c;

 }
