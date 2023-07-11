package com.gfg.arrays.search;


public class LinearSearch {
	public static void main(String[] args) {
		int[] elements = { 5, 9, 6, 2, 4, 5, 1 };
		int linearSearchIndex = linearSearch(elements, 4);
		System.out.println("elemnt is found at :" + linearSearchIndex);
	}

	//time complexity of the linearsearch is O(n).
	private static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i; // returninng the index of the element found in the array.
			}
		}
		return -1; // return -1 if element is not found.
	}
}
