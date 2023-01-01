package com.JavaCollectionsFramework;

/*
 1. Same as HashMap except : Order == Sorted ✔✔✔ (w.r.t. Keys)
    [String Keys -> Lexicographic ordering]
 2. get(K), put(K,V), containsKey(K), containsValue(V), next() : O(logn)   
 */

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMaps {
    public static void main(String[] args) {
        //Creation
        TreeMap<String, Integer> tm = new TreeMap<>(); //<K=Country,V=its_Population>
        //     <  Key , Value  >
        // Key -> always Unique | Value -> may be same

        //Insertion
        tm.put("India", 120);
        tm.put("US", 30);
        tm.put("China", 150);
        System.out.println(tm + "\n");

        tm.put("China", 180);
        System.out.println("Replaced -> " + tm + "\n");

        // contains ***
        if(tm.containsKey("India")) System.out.println("Key i.e. India is present in the tm");
        if(tm.containsValue(120)) System.out.println("Value i.e. 120 is present in the tm\n");
        //if(tm.contains()) X  -> .contains() isn't anything

        // get(Key) -> inputs Key, returns Value
        System.out.println(tm.get("India")); //key exists
        System.out.println(tm.get("Russia") + "\n"); //key doesn't exist

        //Iteration (1)
        System.out.println(tm);
        for (Map.Entry<String, Integer> e : tm.entrySet()) {   // Entry -> e = ["India", 150]
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue() );
        }
        System.out.println();

        //Iteration (2)
        System.out.println(tm);
        Set<String> keys = tm.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + tm.get(key));
        }
    }
}
