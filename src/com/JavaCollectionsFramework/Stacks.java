package com.JavaCollectionsFramework;

 /*
 LIFO
 */


import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Rabbit");
        animals.push("Dog");
        animals.push("Cat");
        System.out.println("Stack -> " + animals);

        System.out.println("The last element : " + animals.peek()); // pointer at last element

        animals.pop();
        System.out.println("After Deletions : " + animals.peek());

        System.out.println("Stack -> " + animals);
    }
}
