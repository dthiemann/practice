package com.dylanthiemann.search;

public class Binary implements Search {
    public boolean Search(int[] array, int k) {
        return BinarySearch(0, array.length - 1, array, k);
    }

    private boolean BinarySearch(int start, int end, int[] array, int k) {
        boolean found = false;

        if (start > end) {return found;}

        int middle = (start + end) / 2;
        if (array[middle] > k) {
            return BinarySearch(middle + 1, end, array, k);
        }
        else if (array[middle] < k) {
            return BinarySearch(start, middle - 1, array, k);
        }
        else {
            return true;
        }
    }
}
