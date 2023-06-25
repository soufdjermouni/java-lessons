package com.interview.errorcompile;

public class variableScope {

    public static void main(String[] args) {
        {
            int x;
            x = 5;
            {
                int y = 6;
                System.out.print(x + " " + y);
            }
            //Error Cannot resolve symbol 'y'
            //has been declared in the local scope(block with curly braces), so it cannot be accessed from outside the scope
           // System.out.println(x + " " + y);
        }
    }
}
