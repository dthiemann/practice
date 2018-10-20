package com.dylanthiemann;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArray = { 5, 48, 79, 1, 6, 9 };
        System.out.print(Arrays.toString(testArray));
        SelectionSort(testArray);
        System.out.print(Arrays.toString(testArray));
    }

    public static void SelectionSort(int[] a) {
        for (var i = 0; i < a.length; i++) {
            int minIndex = minimumIndex(i, a);
            swapIndices(a, i, minIndex);
        }
    }

    public static int minimumIndex(int startIndex, int[] a) {
        var minIndex = startIndex; // Assuming a list of non-negative integers
        for(var i = startIndex + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swapIndices(int[] a, int a_a, int a_b) {
        var temp = a[a_a];
        a[a_a] = a[a_b];
        a[a_b] = temp;
    }
}
