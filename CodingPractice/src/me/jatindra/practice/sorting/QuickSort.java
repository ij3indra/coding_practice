package me.jatindra.practice.sorting;

public class QuickSort {

    public static void main(String args[]) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int partition = partition(array, start , end);

        quickSort(array, start, partition);
        quickSort(array, partition, end);

    }

    // {20, 35, -15, 7, 55, 1, -22}
    // {-22, 35, -15, 7, 55, 1, 20}
    private static int partition(int[] array, int start, int end) {

        System.out.println("Start: " + start +  " end: "+ end);

        int pivotIndex = end - 1;
        int pointerIndex = start - 1;

        for (int i = start; i < end; i++) {
            if (array[i] < array[pivotIndex]) {
                swap(array, i, pointerIndex);
                pointerIndex++;
            }
        }
        swap(array, pointerIndex, pivotIndex);

        return pointerIndex + 1 ;
    }

    private static void swap(int[] array, int pointerIndex, int pivotIndex) {
        int temp = array[pointerIndex];
        array[pointerIndex] = array[pivotIndex];
        array[pivotIndex] = temp;
    }

}
