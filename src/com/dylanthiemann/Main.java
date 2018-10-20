package com.dylanthiemann;
import com.dylanthiemann.sort.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArray = { 5, 48, 79, 1, 6, 9 };
        System.out.print(Arrays.toString(testArray));

        // Selection sort
        var selectionSort = new SelectionSort();
        selectionSort.Sort(testArray);
        System.out.print(Arrays.toString(testArray));

        // Bubble sort
    }
}
