package com.cat;


public interface IntList {
    void addNext(int value);

    void addPrevious(int value);

    void clear();

    boolean contains(int value);

    int get(int index);

    void set(int index, int element);

    int size();

    boolean isEmpty();

    void printIntLinkedList();

}
