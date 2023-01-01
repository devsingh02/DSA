package com.Stacks_and_Queues;

public class CircularQueue {

    static final int MAX = 100;
    int[] a = new int[MAX];
    int front, rear, size;  //current size
    CircularQueue() {
        front = rear = -1;  //don't exist when no. of elements = 0
        size = 0;
    }

    boolean isFull() {
        return ((front == 0 && rear == MAX-1) || (rear == (front-1)%(MAX-1) ));
    }
    boolean isEmpty() { return front > rear; }

    void enqueue(int x) {
        if (isFull()) { System.out.println("Overflow");  return; }
        a[++rear] = x;
    }
    void dequeue() {
        if (isEmpty()) { System.out.println("Underflow");  return; }
        front++;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
