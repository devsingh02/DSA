// s.indexOf(ch) -> CHECKS IF ch PRESENT IN s. ***
// default value = null / 0

package com.Tools;

public class Arrays {
    public static void main(String[] args) {
        String sentence = "AyeBrother...Wassup?";
        String search = "Haha";
        int count = 0;
        for (char ch : search.toCharArray()) {
            if (sentence.indexOf(ch) != -1) // s.indexOf(ch) returns '-1' if ch not present in s
                count++;
        }

        //COPY AN ARRAY
        int[] a = {1,2,3};
        int[] b = a.clone();

        //SORTING  O(n*log(n))
        java.util.Arrays.sort(b);
    }
}