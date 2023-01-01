package com.Stacks_and_Queues;
// rear == top
public class Queue {

    static final int MAX = 100;
    int[] a = new int[MAX];
    int front, rear, size;  //current size
    Queue() {
        front = 0; rear = -1;
        size = 0;
    }

    boolean isFull() { return rear == MAX - 1; }
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

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.display();
    }
}

// rear = 0;

//public class Queue {
//
//    static final int MAX = 100;
//    int[] a = new int[MAX];
//    int front, rear, size;  //current size
//    Queue() {
//        front = rear = 0;
//        size = 0;
//    }
//
//    boolean isFull() { return rear == MAX; }
//    boolean isEmpty() { return front == rear; }
//
//    void enqueue(int x) {
//        if (isFull()) { System.out.println("Overflow");  return; }
//        a[rear] = x;
//        rear = rear % MAX;
//    }
//    void dequeue() {
//        if (isEmpty()) { System.out.println("Underflow");  return; }
//        front++;
//    }
//}
