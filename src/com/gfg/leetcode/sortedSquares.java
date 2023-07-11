package com.gfg.leetcode;

class sortedSquares {
	public static void main(String[] args) {
		sortedSquares(new int[] { -4, -1, 0, 3, 10 });
	}

	public static int[] sortedSquares(int[] nums) {
		squareValuesInArray(nums);
		sort(nums);
		return nums;
	}

	static void squareValuesInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = arr[i]*-1;
			}
			arr[i] = arr[i]*arr[i];
		}
	}

	static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(i, j, arr);
				}
			}
		}
	}

	static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}