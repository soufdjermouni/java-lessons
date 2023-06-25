package com.codinggame.memory;

public class Stack {

    public static void main(String[] args) {

        MemoryLeakOnAStack stack = new MemoryLeakOnAStack(1000);
        for (int i = 0; i < 10000; i++) {//fill the stack
            stack.push("a large, a large, large , large , String "+i);
        }

        for (int i = 0; i < 10000; i++) {//empty stacj
            System.out.println(stack.pop());
        }


    }
}
