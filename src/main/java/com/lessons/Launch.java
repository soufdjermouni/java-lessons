package com.lessons;

import java.util.Arrays;

public class Launch {

    public static void main(String[] args) {
        System.out.printf("hello");
        System.out.println("args = " + Arrays.deepToString(args));

        int x = 10;
        int y = x++;
        int z = ++x;
        int result = x + y + z;
        System.out.println(result);//34

    }
}
