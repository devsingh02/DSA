package com.Strings;

public class IndexOf {
    public static void main(String[] args) {

        String str = "dog cat cat dog";

        int start = 0, end;
         for (int i = 0; i < str.length(); i++) {
             end = str.indexOf(' ', start);
             String word = str.substring(start, end);
             start = end + 1;
         }
    }
}
