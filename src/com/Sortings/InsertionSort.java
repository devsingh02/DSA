package com.Sortings;

public class InsertionSort {

    static void insertionsort(int[] a, int n) {
        for (int i = 1; i < n; i++) {   //UNSORTED elements
            int curr = a[i];//1st unsorted element to compare
            int j = i - 1; //with elements of SORTED ARRAY

            while (j >= 0 && curr < a[j]) { //PUSH : if curr > a[j] place it there
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr;  //j+1 to compensate for j--;
        }
    }

    static void display(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {6, 3, 9, 5, 2, 8, 7};
        int n = a.length;

        System.out.print("Before : ");
        display(a, n);
        insertionsort(a, n);
        System.out.print("After  : ");
        display(a, n);
    }
}
