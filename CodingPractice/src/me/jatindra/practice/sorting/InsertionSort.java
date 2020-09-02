package me.jatindra.practice.sorting;

/*
	complexity: O(n^2)
 */

public class InsertionSort {

	public static void main(String args[]) {
		
		int[] array = { 20, 35, -15, 7, 55, 1, 22 };
		
		for (int firstSortedIndex = 1; firstSortedIndex < array.length; firstSortedIndex++) {
			int element = array[firstSortedIndex];
			
			int i;
			for (i = firstSortedIndex; i > 0 && array[i-1] > element; i--) {
				array[i] = array[i-1];
			}
			
			array[i] = element;
		}
		
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	
}
