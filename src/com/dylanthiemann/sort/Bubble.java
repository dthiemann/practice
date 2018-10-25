package com.dylanthiemann.sort;

public class Bubble implements Sort{
    public void Sort(int[] a){
        BubbleSort(a);
    }

    private void BubbleSort(int[] a) {
        var swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        }
        while (swapped);
    }

    private void swap(int[] a, int index1, int index2) {
        var temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
