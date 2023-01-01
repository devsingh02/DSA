package com.JavaCollectionsFramework;
/* ArrayList allows duplicate values while HashSet doesn't allow duplicates values.
ArrayList maintains the order of the object in which they are inserted while HashSet
is an unordered collection and doesn't maintain any order.
Hashset offers constant time O(1)/O(k) performance for the basic operations like add, remove,
contains, and size.
Objects are inserted based on their hash code.
HashSet not only stores unique Objects but also a unique Collection of Objects like
ArrayList<E>, LinkedList<E>, Vector<E>,..etc.
e.g. HashSet<ArrayList> set = new HashSet<>(); possible


//HashSet is a Set -> doesn't allow duplicate elements

//Time Complexity :-
//Insert/Add -> O(1)
//Delete/Remove -> O(1)
//Search/Contains -> O(1)
*/

 /*
 1. Follows properties of Set ( doesn't allow duplicate elements)
 2. No Fixed order/sequence
 3. HashSet not only stores unique Objects but also a unique Collection of Objects like
    ArrayList<E>, LinkedList<E>, Vector<E>,..etc.
    e.g. HashSet<ArrayList> set = new HashSet<>(); possible
 4. MAIN ADVANTAGE OVER ARRAYLISTS :-
    hs.contains(V) : O(1) ✔✔✔
    hs.remove(V) : O(1) ✔✔✔
    hs.add(V) : O(1)
    hs.clear()
 5. Also stores "null"
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        // Adding elements to the HashSet
        hs.add("geeks");
        hs.add("practice");
        hs.add("contribute");
        hs.add("Ayo");
        System.out.println("Before adding duplicate values \n" + hs);

        // Addition of duplicate elements
        hs.add("geeks");
        hs.add("practice");
        System.out.println("\nAfter adding duplicate values \n" + hs);

        // Addition of null values
        hs.add(null);
        hs.add(null);
        System.out.println("\nAfter adding null values \n" + hs);

        // Deletion
        hs.remove("Ayo");
        System.out.println("\nAfter deletion \n" + hs + "\n");

        // Contains ✔✔✔
        if(hs.contains("geeks")) System.out.println("HS contains 'geeks'\n");

        // Hashset isEmpty
        if(!hs.isEmpty()) {
            System.out.println("set is not empty\n");
        }

        // Iteration -> HashSet does not have an order
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");
    }
}
