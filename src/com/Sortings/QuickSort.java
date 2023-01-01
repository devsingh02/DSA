package com.Sortings;

public class QuickSort {

    static void quicksort(int[] a, int low, int high) { //indexes
        if (low >= high) return;    //stop when singular/empty

        int pind = partition(a, low, high); //puts pivot in right place + returns pind

        quicksort(a, low, pind-1);  //further sort small ones***
        quicksort(a, pind+1, high); //further sort large ones
    }

    static int partition(int[] a, int low, int high) {  // <small, pivot, large>
        int pivot = a[high];
        int i = low - 1; // i = -1 at first : makes place by ++i
        for (int j = low; j < high; j++) {  //***
            if (a[j] < pivot) swap(a, ++i, j);  //all small elements together
        }
        swap(a, ++i, high); //put pivot/high after small elements
        return i;   //pivot now at i
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
        quicksort(a, 0, n-1);   //indexes
        System.out.print("After  : ");
        display(a, n);
    }
}
