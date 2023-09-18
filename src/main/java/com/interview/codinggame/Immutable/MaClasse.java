package com.interview.codinggame.Immutable;

import java.util.Date;

public class MaClasse {

    private final Date theDate;

    public MaClasse (Date theDate) {
        this.theDate = (Date) theDate.clone();//Pour rendre Date immuable
    }
    @Override
    public String toString() {
        return theDate.toString();
    }

}
