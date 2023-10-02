package com.interview.codinggame.memory;

/**
 * The problem with this implementation is that the ArrayList instance used to store the elements of the stack is never
 * cleared or resized. As elements are added and removed from the stack, the ArrayList continues to hold references to
 * these objects, even after they are no longer needed. This prevents the garbage collector from freeing up memory,
 * leading to a memory leak
 *
 * The problem with this implementation is that the ArrayList instance used to store the elements of the stack is never
 * cleared or resized. As elements are added and removed from the stack, the ArrayList continues to hold references to
 * these objects, even after they are no longer needed. This prevents the garbage collector from freeing up memory,
 * leading to a memory leak.
 *
 * To fix this memory leak, we can modify the pop() method to null out the reference to the popped element. Here's an
 * updated version of the Stack class that addresses the memory leak:
 */
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
