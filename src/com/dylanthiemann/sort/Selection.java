package com.dylanthiemann.sort;

public class Selection implements Sort {
    public void Sort(int[] a) {
        SelectionSort(a);
    }

    private void SelectionSort(int[] a) {
        for (var i = 0; i < a.length; i++) {
            int minIndex = minimumIndex(i, a);
            swapIndices(a, i, minIndex);
        }
    }

    private int minimumIndex(int startIndex, int[] a) {
        var minIndex = startIndex; // Assuming a list of non-negative integers
        for(var i = startIndex + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void swapIndices(int[] a, int a_a, int a_b) {
        var temp = a[a_a];
        a[a_a] = a[a_b];
        a[a_b] = temp;
    }
}
