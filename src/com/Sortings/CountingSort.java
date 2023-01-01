package com.Sortings;

// Index = Element | Value/arr[Element] = count of Elements

public class CountingSort {

    static void countingsort(int[] a, int n) {
        int[] ans = new int[n];    //answer.length = given_array.length
        int[] count = new int[10]; //0-9 Range

        for (int i = 0; i < n; i++) {   //COUNTING
            count[a[i]]++;  //put 0++ = 1 at ind 6 (a[0]=6) : showing that 6 exists 1 time
        }
        for (int i = 1; i < 10; i++) {   //COUNTING -> INDEX + 1 : adding all prev
            count[i] += count[i-1];
        }
        for (int i = n-1; i >= 0; i--) {    //PUT FROM LAST (Stable)
            ans[count[a[i]] - 1] = a[i];
          //ans[sorted index of a[i]] = putted a[i];
        }
        for (int i = 0; i < n; i++) {   //COPYING ans[] in a[]
            a[i] = ans[i];
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
        countingsort(a, n);
        System.out.print("After  : ");
        display(a, n);
    }
}
