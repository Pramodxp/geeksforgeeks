package com.gfg.leetcode;

class sortArrayByParity {
	public static void main(String[] args) {
		sortArrayByParity(new int[] { 3, 1, 2, 4 });
	}

	public static int[] sortArrayByParity(int[] nums) {
		int placeHolder = 0;
		int indexToBeMoved = 0;
		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				indexToBeMoved = i;
				value = nums[indexToBeMoved];
				for (int j = indexToBeMoved-1; j >= placeHolder; j--) {
					nums[j + 1] = nums[j];
				}
				nums[placeHolder] = value;
				placeHolder++;
			}
		}
		return nums;
	}
}