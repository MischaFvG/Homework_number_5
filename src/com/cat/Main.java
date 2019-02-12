package com.cat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_5");
        Scanner w = new Scanner(System.in);
        System.out.println("IntLinkedList");
        IntList intList = new IntLinkedList();
        intList.addNext(0);
        intList.addNext(1);
        intList.addNext(2);
        intList.printIntLinkedList();
        System.out.println();
        intList.addPrevious(3);
        intList.addPrevious(4);
        intList.addPrevious(5);
        intList.printIntLinkedList();
        System.out.println();
        System.out.println("Size of IntLinkedList is " + intList.size());
        int number;
        System.out.println("Enter number for finding it in the IntLinkedList");
        number = w.nextInt();
        System.out.println(intList.contains(number));
        int numberIndex;
        System.out.println("Enter index of element for getting it from the IntLinkedList");
        numberIndex = w.nextInt();
        System.out.println("Element of IntLinkedList with " + numberIndex + " is " + intList.get(numberIndex));
        int newNumberIndex;
        int newValue;
        System.out.println("Enter index of element which will be set in IntLinkedList");
        newNumberIndex = w.nextInt();
        System.out.println("Enter value of element which will be set in IntLinkedList");
        newValue = w.nextInt();
        intList.set(newNumberIndex, newValue);
        intList.printIntLinkedList();
        System.out.println();
        System.out.println(intList.isEmpty());
        intList.clear();
        intList.addNext(23);
        intList.addPrevious(12);
        intList.printIntLinkedList();
        System.out.println();
        System.out.println("Stack");
        Stack stack = new IntLinkedList();
        stack.createStack(10);
        stack.addFirst(4);
        stack.addFirst(5);
        stack.addFirst(6);
        stack.addFirst(7);
        stack.addFirst(8);
        System.out.println("First element of stack is " + stack.peekFirst());
        stack.removeFirst();
        System.out.println("First element of stack after removing previous first element is " + stack.peekFirst());
        stack.removeFirst();
        System.out.println("First element of stack after removing previous first element is " + stack.peekFirst());
        System.out.println(stack.isEmptyStack());
        System.out.println(stack.isStackFull());
        printStack(stack);
        System.out.println();
        System.out.println("Queue");
        Queue queue = new IntLinkedList();
        queue.createQueue(5);
        queue.addQueueElement(0);
        queue.addQueueElement(1);
        queue.addQueueElement(2);
        queue.addQueueElement(3);
        queue.addQueueElement(4);
        System.out.println("First element of queue is " + queue.peekQueueElement());
        queue.pollQueueElement();
        System.out.println("First element of queue is " + queue.peekQueueElement());
        queue.pollQueueElement();
        System.out.println("First element of queue is " + queue.peekQueueElement());
        System.out.println(queue.isQueueEmpty());
        System.out.println(queue.isQueueFull());
        printQueue(queue);
        System.out.println();
    }

    private static void printStack(Stack stack) {
        while (!stack.isEmptyStack()) {
            int value = stack.removeFirst();
            System.out.print("[" + value + "]");
        }
    }

    private static void printQueue(Queue queue) {
        while (!queue.isQueueEmpty()) {
            int queueValue = queue.pollQueueElement();
            System.out.print("[" + queueValue + "]");
        }
    }
}
