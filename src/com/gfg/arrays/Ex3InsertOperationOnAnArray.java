package com.gfg.arrays;

/**
 * @author pramodr
 *
 */
public class Ex3InsertOperationOnAnArray {
	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// current size of the array
		int size = 3;

		// element need to be inserted into an array
		int element1 = 50;
		int cap = arr.length;
		int element2 = 60;
		int element3 = 70;
		int element4 = 80;
		System.out.println(size = insertElement(arr, size, element1, cap, 3));
		System.out.println(size = insertElement(arr, size, element2, cap, 4));
		System.out.println(size = insertElement(arr, size, element3, cap, 3));
		System.out.println(size = insertElement(arr, size, element4, cap, 3));
	}

	// below insert method inserts element to the end of the array and return the
	// size of the array.
	// if array is full, insertion will not happen.
	/**
	 * @param arr     array which contains elemnts
	 * @param size    current size of the elements present in the array
	 * @param element element which need to be inserted.
	 * @param cap     capacity of the array
	 * @param pos     position where the element need to be inserted at.
	 * @return the size of the array after insertion
	 */
	static int insertElement(int[] arr, int size, int element, int cap, int pos) {
		//only the space is present in an array insert operation will be done,else no.
		if (cap == size) {
			return size;
		}
		int index = pos - 1; // as array starts from 0th index we are decrementing the value.

		//this loop keeps moving the elements to the right hand side until the current position is usable.
		//keeps coming back by moving elements to right index.
		for (int i = (size - 1); i >= index; i--) { //i = size = 3 and index = 2  
			arr[i + 1] = arr[i];
		}
		arr[index] = element;
		return size + 1;

	}
}
