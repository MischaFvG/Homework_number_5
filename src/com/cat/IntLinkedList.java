package com.cat;


public class IntLinkedList implements IntList, Stack, Queue {

    private class Element {
        private int value;
        private Element nextElement;

        public Element(int value) {
            this.value = value;
        }
    }

    private int countList = 0;
    private Element firstElementList;
    private Element lastElementList;

    @Override
    public void addNext(int value) {
        Element element = new Element(value);
        if (firstElementList == null) {
            firstElementList = element;
            lastElementList = element;
        } else {
            lastElementList.nextElement = element;
            lastElementList = element;
        }
        countList++;
    }

    @Override
    public void addPrevious(int value) {
        Element element = new Element(value);
        if (firstElementList == null) {
            firstElementList = element;
            lastElementList = element;
        } else {
            element.nextElement = firstElementList;
            firstElementList = element;
        }
        countList++;
    }

    @Override
    public void clear() {
        countList = 0;
        firstElementList = null;
        lastElementList = null;
    }

    @Override
    public boolean contains(int value) {
        Element element = firstElementList;
        while (element != null) {
            if (element.value == value) {
                return true;
            }
            element = element.nextElement;
        }
        return false;
    }

    @Override
    public int get(int index) {
        Element element = firstElementList;
        for (int i = 0; i < index; i++) {
            element = element.nextElement;
        }
        return element.value;
    }

    @Override
    public void set(int index, int element) {
        Element element1 = firstElementList;
        for (int i = 0; i < index; i++) {
            element1 = element1.nextElement;
        }
        element1.value = element;
    }

    @Override
    public int size() {
        return countList;
    }

    @Override
    public boolean isEmpty() {
        return countList == 0;
    }

    public void printIntLinkedList() {
        Element element = firstElementList;
        while (element != null) {
            System.out.print("[" + element.value + "]");
            element = element.nextElement;
        }
    }

    private Element[] stackArray;
    private int topStackElement;
    private int stackSize;

    @Override
    public void createStack(int size) {
        this.stackSize = size;
        this.stackArray = new Element[stackSize];
        this.topStackElement = -1;
    }


    @Override
    public void addFirst(int value) {
        Element element = new Element(value);
        stackArray[++topStackElement] = element;
    }

    @Override
    public int peekFirst() {
        return stackArray[topStackElement].value;
    }

    @Override
    public int removeFirst() {
        return stackArray[topStackElement--].value;
    }

    @Override
    public boolean isEmptyStack() {
        return topStackElement == -1;
    }

    @Override
    public boolean isStackFull() {
        return (topStackElement == stackSize - 1);
    }

    private Element[] queueArray;
    private int sizeQueue;
    private int countQueueElements;
    private int firstQueueIndex;
    private int lastQueueIndex;

    @Override
    public void createQueue(int size) {
        this.sizeQueue = size;
        this.queueArray = new Element[sizeQueue];
        this.countQueueElements = 0;
        this.firstQueueIndex = 0;
        this.lastQueueIndex = -1;
    }

    @Override
    public void addQueueElement(int value) {
        Element element = new Element(value);
        if (lastQueueIndex == sizeQueue - 1) {
            lastQueueIndex = -1;
        }
        queueArray[++lastQueueIndex] = element;
        countQueueElements++;
    }

    @Override
    public int peekQueueElement() {
        return queueArray[firstQueueIndex].value;
    }

    @Override
    public int pollQueueElement() {
        int queueElement = queueArray[firstQueueIndex++].value;
        if (firstQueueIndex == sizeQueue) {
            firstQueueIndex = 0;
        }
        countQueueElements--;
        return queueElement;
    }

    @Override
    public boolean isQueueEmpty() {
        return countQueueElements == 0;
    }

    @Override
    public boolean isQueueFull() {
        return (countQueueElements == sizeQueue - 1);
    }
}
