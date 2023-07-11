package com.gfg.leetcode;

import java.util.Arrays;
import java.util.Comparator;

class MaxIceCream {
	public static void main(String[] args) {
		maxIceCream(null, 0);
	}

	public static int maxIceCream(int[] costs, int coins) {
		Arrays.sort(costs);
		int count = 0;
		for (int i = 0; i < costs.length; i++) {
			if (coins >= costs[i]) {
				coins -= costs[i];
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}