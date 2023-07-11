package com.geeksforgeeks.practice;

public class MergeSort {

	public static void main(String[] args) {
		int [] array = new int[] { 5, 6, 3, 6, 7, 9 };
		print(array);
		mergeSort(array);
		print(array);
	}

	public static void mergeSort(int[] array) {

		// base case or termination condition.

		if (array.length == 1) {
			return;
		}
		// divide the array into 2 parts left and right
		int low = 0;
		int high = array.length - 1;
		int midIndex = low + high / 2;

		int[] leftArray = new int[midIndex + 1];
		int[] rightArray = new int[high - midIndex];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[i];
		}

		for (int i = midIndex + 1, j = 0; j < rightArray.length; i++, j++) {
			rightArray[j] = array[i];
		}

		// split the left array and right array till they reach 1 element in an array
		// using recurssion.
		mergeSort(leftArray);
		mergeSort(rightArray);

		// merge both the arrays left and right to main array.
		merge(array, leftArray, rightArray);
	}

	public static void merge(int[] array, int[] leftArray, int[] rightArray) {

		// we need 3 variables or pointers to loop over all the arrays.
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		if (i < leftArray.length) {
			while (i < leftArray.length) {
				array[k] = leftArray[i];
				i++;
				k++;
			}
		}

		if (j < rightArray.length) {
			while (j < rightArray.length) {
				array[k] = rightArray[j];
				j++;
				k++;
			}
		}
	}

	private static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
