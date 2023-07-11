package com.gfg.arrays;

public class Ex10RemoveDuplicatesFromAnSortedArray {

	public static void main(String[] args) {
		removeDuplicates(new int[] { 1, 2, 2, 3, 3, 4, 4, 5 });
		removeDuplicatesAndGetSize(new int[] { 1, 2, 2, 3, 3, 4, 4, 5 });
	}

	static int[] removeDuplicates(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}

		// inserting unique values into array.
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

	// effecient approach
	//O(n) time complexity
	//theta of 1 extra space.
	static int removeDuplicatesAndGetSize(int[] arr) {
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

}
