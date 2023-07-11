package com.gfg.arrays;

/**
 * @author pramodr
 *
 */
public class Ex4DeleteOperationOnAnArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 8, 12, 5, 6 };
		System.out.println(deleteElement(arr, 12, 5));
	}

	static int[] deleteElement(int[] arr, int element, int size) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				arr[i] = 0;
				for (int j = i; j < size - 1; j++) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
