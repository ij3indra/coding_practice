package com.jatin.practice;

public class SelectionSort {
    // o(n^2)
    public static void  main(String args[]) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(array, largestIndex, lastUnsortedIndex);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
