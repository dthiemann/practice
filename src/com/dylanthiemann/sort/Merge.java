package com.dylanthiemann.sort;

public class Merge implements Sort {
    public void Sort(int[] a) {

    }

    public void mergeSort(int[] a) {

    }

    public void int[] combine(int[] a_1, int[] a_2) {
        var newArray = new int[a_1.length + a_2.length];

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < a_1.length && j < a_2.length) {
            if (a_1[i] > a_2[j]) {
                newArray[index] = a_2[j];
                j++;
            } else {
                newArray[index] = a_1[i];
                i++;
            }
            index++;
        }

        // Fill remaining if applicable
        if (i != a_1.length) {
            while (i < a_1.length) {
                newArray[index] = a_1[i];
                index++;
                i++;
            }
        }
        if (j != a_2.length) {
            while (j < a_2.length) {
                newArray[index] = a_2[j];
                index++;
                i++;
            }
        }

        return newArray;
    }
}
