package com.gfg.arrays;

public class Ex7SecondLargestElementInArray {

	public static void main(String[] args) {
		getSecondLargestElementInAnArray(new int[] { 3, 8, 12, 5, 6 });
		findSecondLargestElementInAnArray(new int[] { 8, 1, 12, 5, 6 });
	}

	// nive approach
	static int getSecondLargestElementInAnArray(int arr[]) {
		int largestIndex = getLargestElementInAnArrayEfficient(arr);
		int res = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[largestIndex] != arr[i]) {
				if (res == -1) {
					res = i;
				} else if (arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}

	// effecient approach
	// Time : O(n)
	static int getLargestElementInAnArrayEfficient(int[] arr) {
		int highest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[highest]) {
				highest = i;
			}
		}
		return highest;
	}

	// effecient approach
	static int findSecondLargestElementInAnArray(int[] arr) {
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[largest]) {
				secondLargest = largest;
				largest = i;
			}
		}
		return secondLargest;
	}

}
