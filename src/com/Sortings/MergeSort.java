package com.Sortings;

public class MergeSort {

    static void divide(int[] a, int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si)/2;   //(si + ei)/2   may give error in large sizes
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conquer(a, si, mid, ei);
    }

    static void conquer(int[] a, int si, int mid, int ei) {
        int ind1 = si;
        int ind2 = mid + 1;
        int m = 0;
        int[] merged = new int[ei - si + 1];    //***
        while (ind1 <= mid && ind2 <= ei) {
            if (a[ind1] <= a[ind2]) merged[m++] = a[ind1++];
            else merged[m++] = a[ind2++];
        }
        //leftover, since both arrays might be different in size
        while (ind1 <= mid) merged[m++] = a[ind1++];   //will run only if something left ***
        while (ind2 <= ei) merged[m++] = a[ind2++];    //***

        for (int i = si, j = 0; j < merged.length; i++, j++) {  //COPYING Merged -> Original Array
            a[i] = merged[j];
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
        divide(a, 0, n - 1);
        System.out.print("After  : ");
        display(a, n);
    }
}
