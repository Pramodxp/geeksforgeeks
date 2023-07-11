package com.gfg.arrays.search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] elements = { 5, 9, 6, 2, 4, 5, 1 };
		int linearSearchIndex = binarySearch(elements, 4);
		System.out.println("elemnt is found at :" + linearSearchIndex);
	}

	// binary search basically uses divide and conquer method.
	// binary search can only be used on the sorted array.
	private static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int middlePosition = (low + high) / 2;
			int middleValue = array[middlePosition];
			if (middleValue == key) {
				return middlePosition;
			}

			if (key > middleValue) {
				low = middlePosition + 1;
			} else {
				high = middlePosition - 1;
			}
		}
		return -1;
	}
}
