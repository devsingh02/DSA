package com.JavaCollectionsFramework;

/*
 1. Same as HashMap except : Order -> Input Sequence
 2. next() : O(1)   [lhm->O(h/n)]
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMaps {
    public static void main(String[] args) {
        //Creation
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); //<K=Country,V=its_Population>
        //     <  Key , Value  >
        // Key -> always Unique | Value -> may be same

        //Insertion
        lhm.put("India", 120);
        lhm.put("US", 30);
        lhm.put("China", 150);
        System.out.println(lhm + "\n");

        lhm.put("China", 180);
        System.out.println("Replaced -> " + lhm + "\n");

        // contains ***
        if(lhm.containsKey("India")) System.out.println("Key i.e. India is present in the lhm");
        if(lhm.containsValue(120)) System.out.println("Value i.e. 120 is present in the lhm\n");
        //if(lhm.contains()) X  -> .contains() isn't anything

        // get(Key) -> inputs Key, returns Value
        System.out.println(lhm.get("India")); //key exists
        System.out.println(lhm.get("Russia") + "\n"); //key doesn't exist

        //Iteration (1)
        System.out.println(lhm);
        for (Map.Entry<String, Integer> e : lhm.entrySet()) {   // Entry -> e = ["India", 150]
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue() );
        }
        System.out.println();

        //Iteration (2)
        System.out.println(lhm);
        Set<String> keys = lhm.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + lhm.get(key));
        }
    }
}
