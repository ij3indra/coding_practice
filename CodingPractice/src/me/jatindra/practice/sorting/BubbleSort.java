package me.jatindra.practice.sorting;

public class BubbleSort {

	public static void main(String args[]) {

		int[] array = { 20, 35, -15, 7, 55, 1, 22 };

		for (int lastUnSortedIndex = array.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
			for (int i = 0; i < lastUnSortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}
