package com.interview.codinggame.Immutable;

import java.util.Date;

public class ImmutableObjectUsingDate {

    public static void main(String[] args) {

        Date d = new Date();
        MaClasse c = new MaClasse(d);
        d.setYear(98);
        System.out.println(c);

    }
}
