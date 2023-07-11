package com.gfg.leetcode;

class decompressRLElist {
	public static void main(String[] args) {
		decompressRLElist(new int[] { 1, 2, 3, 4 });
	}

	public static int[] decompressRLElist(int[] nums) {
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				size += nums[i];
			}
		}
		int[] res = new int[size];

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				for (int k=1; k <= nums[i]; j++) {
					res[j] = nums[i + 1];
					k++;
				}
			}
		}

		return res;
	}
}