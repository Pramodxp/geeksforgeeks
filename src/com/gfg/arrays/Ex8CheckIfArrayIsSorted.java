package com.gfg.arrays;

public class Ex8CheckIfArrayIsSorted {

	public static void main(String[] args) {
		reverse(new int[] { 3, 8, 12, 5, 6 });
	}

	// nive approach
	// time complexity O(nsquare)
	//extra space theta(1)
	static int[] reverse(int arr[]) {
		int high = arr.length - 1;
		int low = 0;
		for (int i = 0; i < arr.length; i++) {
			if (low < high) {
				int temp = arr[high];
				arr[high] = arr[low];
				arr[low] = temp;
				high--;
				low++;
			}
		}
		return arr;
	}

}
