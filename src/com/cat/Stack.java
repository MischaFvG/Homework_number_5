package com.cat;

public interface Stack {
    void createStack(int size);

    void addFirst(int value);

    int peekFirst();

    int removeFirst();

    boolean isEmptyStack();

    boolean isStackFull();


}
