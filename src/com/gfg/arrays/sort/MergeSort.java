package com.gfg.arrays.sort;

import java.util.Iterator;
import java.util.Random;

public class MergeSort {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10);
		}
		
		System.out.println("before sorting the values : ");
		printValues(numbers);
		
		//using merge sort
		mergeSort(numbers);
		
		System.out.println("after sorting the values : ");
		printValues(numbers);
	}

	private static void mergeSort(int[] array) {

		// exit statement because we are using recurssion.
		if (array.length < 2) {
			return;
		}

		// step 1 : split array into 2
		int mid = array.length / 2;
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[array.length - mid];

		// fill the elements into the splitted arrays.
		for (int i = 0; i < mid; i++) {
			leftHalf[i] = array[i];
		}
		for (int i = mid; i < array.length; i++) {
			rightHalf[i - mid] = array[i];
		}

		mergeSort(leftHalf); // calling recursively until the array contain 1 element.
		mergeSort(rightHalf);
		
		//merging both the arrays
		merge(array, leftHalf, rightHalf);
	}

	// merge both the arrays in sorted order and make it as single array.
	private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		// to iterate over 3 arrays we need 3 pointers.
		int i=0, j=0, k = 0;

		//to avoid out of bounds exception.
		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				array[k] = leftHalf[i];
				i++; // left pointer will be moving forward if left half element is less than right half element.
			}else {
				array[k]=rightHalf[j];
				j++;//// right pointer will be moving forward if right half element is less than left half element.
			}
			k++; //moving forward the main array for insertion of new value.
		}
		
		//scenario when the left or right arrray remain with the elements ,, adding them to the main array.
		while(i<leftSize) {
			array[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			array[k] = rightHalf[j];
			j++;
			k++;
		}

	}
	
	private static void printValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
