package com.Stacks_and_Queues;

public class Stack {

    static final int MAX = 100;
    int[] a = new int[MAX];
    int top;
    Stack() {
        top = -1;
    }

    boolean Underflow() { return top < 0; }
    boolean Overflow() { return top >= MAX-1; }

    void push(int x) {
        if(Overflow()) { System.out.println("Overflow");  return; }
        a[++top] = x;
    }
    void pop() {
        if(Underflow()) { System.out.println("Underflow");  return; }
        top--;
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.display();
    }
}
