package com.gfg.arrays;

/**
 * @author pramodr
 *
 */
public class Ex5DeleteOperationOnAnArray {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 8, 12, 5, 6 };
		deleteElementFromArray(nums, 8);
	}

	
	/**
	 * @param arr
	 * @param element
	 * @return index of the element.
	 */
	static int deleteElementFromArray(int[] arr, int element) {
		int i;
		//finds the element index in the array;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				arr[i] = 0;
				break;
			}
		}

		// returns the index if elment is found at last index.
		if (i == arr.length - 1) {
			return i;
		}
		//moves all the element to the end of the array.
		for (int j = i; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		
		return i;
	}
}
