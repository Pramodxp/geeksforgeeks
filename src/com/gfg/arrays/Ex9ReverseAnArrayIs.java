package com.gfg.arrays;

public class Ex9ReverseAnArrayIs {

	public static void main(String[] args) {
		isArraySorted(new int[] { 3, 8, 12, 5, 6 });
		isArraySortedEfficient(new int[] { 8, 1, 12, 5, 6 });
	}

	// nive approach
	// time complexity O(nsquare)
	static boolean isArraySorted(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	// effecient approach
	// Time : O(n)
	static boolean isArraySortedEfficient(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] > arr[i]) {
				return false;
			}
		}
		return true;
	}


}
