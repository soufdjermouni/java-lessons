package com.interview.errorcompile;

import java.io.IOException;

//Compile Time Error. The reason is 'IOException' should be captured before capturing
// the Generation Exception.
public class JavaBrushupFinaly {
    static public void main(String[] args) {
        try {
            throw new Exception("Hello ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
       } /* catch (IOException e) {
            System.out.print(e.getMessage());
        } */
        finally {
            System.out.println("World");
        }
    }
}
