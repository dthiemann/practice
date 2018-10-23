package com.dylanthiemann;
import com.dylanthiemann.search.Binary;
import com.dylanthiemann.sort.Bubble;
import com.dylanthiemann.sort.Selection;
import com.dylanthiemann.sort.Merge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArray;

        // Selection sort
        System.out.print("Selection Sort \n");
        testArray = new int[] { 5, 48, 79, 1, 6, 9 };
        System.out.print(Arrays.toString(testArray) + "\n");
        var selectionSort = new Selection();
        selectionSort.Sort(testArray);
        System.out.print(Arrays.toString(testArray) + "\n");

        // Bubble sort
        System.out.print("Bubble Sort \n");
        testArray = new int[] { 5, 48, 79, 1, 6, 9 };
        System.out.print(Arrays.toString(testArray) + "\n");
        var bubbleSort = new Bubble();
        bubbleSort.Sort(testArray);
        System.out.print(Arrays.toString(testArray) + "\n");

        // Merge sort
        System.out.print("Merge Sort \n");
        testArray = new int[] { 5, 48, 79, 1, 6, 9 };
        System.out.print(Arrays.toString(testArray) + "\n");
        var mergeSort = new Merge();
        mergeSort.Sort(testArray);

        // Binary
        System.out.print("Bubble Sort \n");
        testArray = new int[] { 5, 48, 79, 1, 6, 9 };
        bubbleSort.Sort(testArray);
        var binarySearch = new Binary();
        System.out.println("Result of finding 6: " + binarySearch.Search(testArray, 6));
        System.out.println("Result of finding 8: " + binarySearch.Search(testArray, 8));
    }
}
