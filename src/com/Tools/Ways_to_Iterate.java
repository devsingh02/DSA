package com.Tools;

public class Ways_to_Iterate {
    public static void main(String[] args) {

        int[] arr = {12, 4, 8, 16};
        // METHOD 1
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            System.out.print(val + " ");
        }
        System.out.println();

        // METHOD 2
        for (int val : arr) {   // for (variable that stores elements : Collection)
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
