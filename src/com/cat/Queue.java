package com.cat;

public interface Queue {
    void createQueue(int size);

    void addQueueElement(int value);

    int peekQueueElement();

    int pollQueueElement();

    boolean isQueueEmpty();

    boolean isQueueFull();
}
