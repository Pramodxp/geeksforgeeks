package com.gfg.arrays.sort;

public class QuickSort {
	public static void main(String[] args) {

	}

	private static void quickSort(int[] array, int lowIndex, int highIndex) {

		// select the pivot value in array.
		int pivotValue = array[highIndex];

		// move the the lower values to left of the pivot value and higher values to the
		// right of the pivot value.
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			// finds the value which is higher than the pivot value
			while (array[leftPointer] <= pivotValue && leftPointer < rightPointer) {
				leftPointer++;
			}

			// finds the value which is lower than the pivot value.
			while (array[rightPointer] >= pivotValue && leftPointer < rightPointer) {
				rightPointer--;
			}

			// if both the above loops breaked out then we found the lowest and highest
			// element in the array
			swap(array, lowIndex, rightPointer);
		}
		swap(array, leftPointer, highIndex);

		
	}

	private static void swap(int array[], int lowIndex, int highIndex) {
		int temp = array[lowIndex];
		array[lowIndex] = array[highIndex];
		array[highIndex] = temp;
	}
}
