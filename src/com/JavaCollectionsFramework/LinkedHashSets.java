package com.JavaCollectionsFramework;

/*
 1. Completely same as HashSet in every sense, except :
    Order = Input Sequence
 */

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();   //Set<Str.... also possible
        // Adding elements to the LinkedHashSet
        lhs.add("geeks");
        lhs.add("practice");
        lhs.add("contribute");
        lhs.add("Ayo");
        System.out.println("Before adding duplicate values \n" + lhs);

        // Addition of duplicate elements
        lhs.add("geeks");
        lhs.add("practice");
        System.out.println("\nAfter adding duplicate values \n" + lhs);

        // Addition of null values
        lhs.add(null);
        lhs.add(null);
        System.out.println("\nAfter adding null values \n" + lhs);

        // Deletion
        lhs.remove("Ayo");
        System.out.println("\nAfter deletion \n" + lhs + "\n");

        // Contains ✔✔✔
        if(lhs.contains("geeks")) System.out.println("LHS contains 'geeks'\n");

        // LinkedHashset isEmpty
        if(!lhs.isEmpty()) {
            System.out.println("set is not empty\n");
        }

        // Iteration -> LinkedHashSet has an order = Input Sequence
        Iterator it = lhs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");
    }
}
