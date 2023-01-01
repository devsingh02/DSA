package com.JavaCollectionsFramework;

 /*
   Same as ArrayList
  */

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        // ANY OTHER DATATYPE OTHER THAN INT :- DIRECT
        String[] s = {"a", "b", "c"};
        List<String> list1 = new LinkedList<>(Arrays.asList(s)); //List or ArrayList

        // FOR INT :- LOOP
        int[] a = {7, 8, 9};
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int I : a) list2.add(I);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(4); list.add(5); list.add(6);
        list.addAll(list2); //adding list2 to list

        System.out.println(list); // proper display

        System.out.println(list.get(1));

        System.out.println(list.contains(2));

        list.add(0,10);
        System.out.println(list);

        list.set(1,20);  //index,element
        System.out.println(list);

        list.remove(3);
        list.remove(Integer.valueOf(5));
        System.out.println(list);

        Collections.sort(list); // O(nlogn)
        System.out.println(list);

        // ITERATION
        // METHOD 1
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // METHOD 2
        for (Integer I : list) {
            System.out.print(I + " ");
        }
        System.out.println();
        // METHOD 3
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        list.clear(); // clears list
        System.out.println(list);
    }
}
