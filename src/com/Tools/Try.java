package com.Tools;

import java.util.StringTokenizer;

public class Try {
    public static void main(String[] args) {
//        System.out.println((int)2.7);
//        int[] a= new int[5];
//        System.out.println(a[2]);
        String s = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
//        System.out.println(s.length());
//        String w = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
//        StringTokenizer st = new StringTokenizer(w, " ");
//        System.out.println(st.countTokens());
        int i;
        for (i = 0; i < 10; i++) {

        }
        System.out.println(i);
    }
}

//import java.util.StringTokenizer;
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//
//        StringTokenizer st = new StringTokenizer(s, " ");  // O(n*1)
//        HashMap<String, Integer> WtoI = new HashMap<>();
//        HashMap<Character, Integer> CtoI = new HashMap<>();
//
//        int i = 0;
//        while (st.hasMoreTokens()) {
//            if (i==pattern.length())    // pattern < words
//                return false;
//            String word = st.nextToken();
//            char ch = pattern.charAt(i);
//            if (WtoI.get(word) != CtoI.get(ch)) //get() gives null if Key not presesnt
//                return false;
//            WtoI.put(word, i);
//            CtoI.put(ch, i++);
//        }
//        if (i != pattern.length())   // words > pattern
//            return false;
//        return true;
//    }
//}
