package me.jatindra.practice.sorting;

/*
    divide and conquer algorithm
    used recursion to split arrays in two parts (right and left) until single element remain
    merge the divided left and right part to full array
    complexity: O(nlogn)
 */

public class MergeSort {

    public static void main(String args[]) {
        int[] array = { 20, 35, -15, 7, 55, 1, 22 };

        mergeSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, 22 };
    private static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(array,start, mid);
        mergeSort(array,mid, end);
        merge(array, start, mid, end);

    }

    // { 20, 35, -15, 7, 55, 1, 22 };
    /*
        Start: 1 mid: 2 end: 3
        Start: 0 mid: 1 end: 3
        Start: 3 mid: 4 end: 5
        Start: 5 mid: 6 end: 7
        Start: 3 mid: 5 end: 7
        Start: 0 mid: 3 end: 7
     */
    private static void merge(int[] array, int start, int mid, int end) {
        System.out.println("Start: " + start + " mid: " + mid + " end: "+ end);

        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int[] tempArray = new int[end - start];
        int i = start, j = mid, index = 0;

        while (i < mid && j < end) {
            if (array[i] > array[j]) {
                tempArray[index] = array[j];
                j++;
            } else {
                tempArray[index] = array[i];
                i++;
            }
            index++;
        }

        // copying remaining elements left array
        while ( i < mid) {
            tempArray[index] = array[i];
            i++;
            index++;
        }

        // copying remaining elements from right array
        while ( j < end) {
            tempArray[index] = array[j];
            j++;
            index++;
        }

        System.arraycopy(tempArray, 0, array, start, tempArray.length);

    }
}
