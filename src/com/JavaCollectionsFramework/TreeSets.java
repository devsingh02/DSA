package com.JavaCollectionsFramework;

/*
 1. Same as HashSet except : Order == Sorted ✔✔✔
 2. add(), contains(), remove() :-
    HashSet, LinkedHashSet = O(1)
    TreeSet = O(logn)  XXX
 3. next() : hs->O(h/n) lhs->O(1) ts->O(logn)
 4. Addition of null values not possible
 */

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        // Adding elements to the HashSet
        ts.add(12);
        ts.add(38);
        ts.add(6);
        ts.add(101);
        ts.add(3);
        ts.add(1);
        System.out.println("Before adding duplicate values \n" + ts);

        // Addition of duplicate elements
        ts.add(101);
        ts.add(12);
        System.out.println("\nAfter adding duplicate values \n" + ts);

        // Addition of null values -> not possible
//        ts.add(null);
//        ts.add(null);
//        System.out.println("\nAfter adding null values \n" + ts);

        // Deletion
        ts.remove(3);
        System.out.println("\nAfter deletion \n" + ts + "\n");

        // Contains
        if(ts.contains(101)) System.out.println("TS contains '101'\n");

        // TreeSet isEmpty
        if(!ts.isEmpty()) {
            System.out.println("set is not empty\n");
        }

        // Iteration -> TreeSet does have an order = Sorted
        Iterator it = ts.iterator();    //next : O(logn) XXX
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");
    }
}
