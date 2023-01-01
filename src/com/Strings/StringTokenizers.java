package com.Strings;

// Time Complexity : O(n*d)  where d = no. of delimiters

import java.util.StringTokenizer;

public class StringTokenizers {
    public static void main(String[] args) {
        String str = "My name is Devansh Singh";
        StringTokenizer st = new StringTokenizer(str," ");  // O(n*d)
        String[] s = new String[st.countTokens()];

        for (int i = 0; i < s.length; i++) {    // O(n)
            s[i] = st.nextToken();
        }

        System.out.println("Your String in Reverse Order :-");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
    }
}
