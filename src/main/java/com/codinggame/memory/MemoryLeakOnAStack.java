package com.codinggame.memory;

import java.util.EmptyStackException;

/**
 * This stack has a memory leak. Find the cause and apply a fix.
 */
public class MemoryLeakOnAStack {


    // keep these two fields as they are
    private Object[] elements;
    private int size = 0;

    public MemoryLeakOnAStack(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public void push(Object object) {
        ensureCapacity();
        elements[size++] = object;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //avant
        //return elements[--size];


        //Solution pour eviter le leak
        //By nulling out the reference to the popped element, we allow the garbage collector to reclaim the memory
        // used by that object. This ensures that the stack implementation does not hold onto unnecessary memory
        // and prevents the memory leak.
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            Object[] old = elements;
            elements = new Object[2 * size + 1];
            System.arraycopy(old, 0, elements, 0, size);
        }
    }
}