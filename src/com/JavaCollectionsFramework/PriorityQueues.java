package com.JavaCollectionsFramework;

/*
 PROPERTY/ADVANTAGE OF :-
 Priority_Queues -> enables the use of properties of heaps in Programming
 Heaps -> Always know the root
 Max-Heap -> Always know the Max-Value (root)
 Min-Heap -> Always know the Min-Value (root)
 */

/*
  1. Same as Queue except : Sorted (Min/Max HEAP) i.e. it follows property of HEAPS
  2. Property of heaps != Sorted, but = ALWAYS KNOW THE VALUE OF MIN/MAX ELEMENT (START OF QUEUE / ROOT / FIFO)
  3. Max-Heaps -> Parent > children
  4. ∵ Internal structure is HEAP, ∴ All operations -> log(n)
  5. Order of display -> BFS (level-wise of the Heap)
  6. Queue<Integer> pq = new PriorityQueue<>();  also possible
 */

/*
  Upon every offer/add : the element is heapified (O(logn)) in the heap
 */

import java.util.PriorityQueue;
import java.util.Comparator;    // for Max-Heap

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq_min = new PriorityQueue<>(); // MIN-HEAP

        pq_min.offer(12);
        pq_min.offer(4);
        pq_min.offer(8);
        pq_min.offer(32);
        System.out.println("Order -> " + pq_min); // Order -> BFS

        System.out.println("The Minimum element : " + pq_min.peek());

        System.out.println("Root : " + pq_min.poll()); // poll() returns the deleted value

        System.out.println("After Deletions : " + pq_min);

        System.out.println("\n");

        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Comparator.reverseOrder()); // MAX-HEAP

        pq_max.offer(12);
        pq_max.offer(4);
        pq_max.offer(8);
        pq_max.offer(32);
        System.out.println("Order -> " + pq_max); // Order -> BFS

        System.out.println("The Minimum element : " + pq_max.peek());

        System.out.println("Root : " + pq_max.poll()); // poll() returns the deleted value

        System.out.println("After Deletions : " + pq_max);
    }
}
