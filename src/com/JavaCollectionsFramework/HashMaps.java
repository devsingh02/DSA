package com.JavaCollectionsFramework;
/*
O(1)
 K -> V (i.e. from Key Value can be found. Not vice-versa)

HashSet is a set, e.g. {1, 2, 3, 4, 5, 6, 7} whereas
Hashmap is a key <-> value i.e. a PAIR (key to value) hm, e.g. {a -> 1, b -> 2, c -> 2, d -> 1}

Hashset -> No Duplicate Elements
Hashmap -> No Duplicate Keys, Duplicate Elements ✓

hm.put(K,V) -> if key already exists, REPLACES value of the already existing key
hm.putIfAbsent(K, V)

hm.remove(K) -> deletes K, V

hm.containsKey(K) -> if value exists : returns true ***
                   -> if it doesn't   : returns false
hm.containsValue(V) ***

hm.get(K) -> exists : return Value (get(key) only) ***
           -> doesn't: return null

hm.getOrDefault(K,<default-value>) : returns V (K->V) if K present, else returns <default-value> ***

hm.entrySet() -> creates Set of Entries (pair)
               -> converts Hashmap to Set (for iteration)

hm.keySet() > creates Set of Keys

 e = ["India", 150]
 e.getKey() : "India" | e.getValue() : 150
 */

/*
 1. Unique Keys. If same key input -> REPLACED
 2. No Order
 3. get(K), put(K,V), putIfAbsent(K,V), containsKey(K), containsValue(V) : O(1)
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        //Creation
        HashMap<String, Integer> hm = new HashMap<>(); //<K=Country,V=its_Population>
        //     <  Key , Value  >
        // Key -> always Unique | Value -> may be same

        //Insertion
        hm.put("India", 120);
        hm.put("US", 30);
        hm.put("China", 150);
        System.out.println(hm + "\n");

        hm.put("China", 180);
        System.out.println("Replaced -> " + hm + "\n");

        // contains ***
        if(hm.containsKey("India")) System.out.println("Key i.e. India is present in the hm");
        if(hm.containsValue(120)) System.out.println("Value i.e. 120 is present in the hm\n");
        //if(hm.contains()) X  -> .contains() isn't anything

        // get(Key) -> inputs Key, returns Value
        System.out.println(hm.get("India")); //key exists
        System.out.println(hm.get("Russia") + "\n"); //key doesn't exist

        //Iteration (1)
        System.out.println(hm);
        for (Map.Entry<String, Integer> e : hm.entrySet()) {   // Entry -> e = ["India", 150]
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue() );
        }
        System.out.println();

        //Iteration (2)
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + hm.get(key));
        }
    }
}

/*

 BILATERAL MAPPING / BIJECTION : (where every key has 1 unique value) [LC Q.290]

import java.util.StringTokenizer;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        HashMap<String, Character> hm = new HashMap<>();

        if (pattern.length() != st.countTokens()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            String word = st.nextToken();   //curr_word
            char ch = pattern.charAt(i);    //curr_ch

            if (hm.containsKey(word) && hm.get(word) == ch)       *************
                continue;
            if (!hm.containsKey(word) && !hm.containsValue(ch)) {
                hm.put(word, ch);
                continue;
            }
            return false;
        }
        return true;
    }
}

 */