package com.gfg.leetcode;

import java.util.HashSet;
import java.util.Set;

class isHappy {
	public static void main(String[] args) {
		isHappy(2);
	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			n = getNextValue(n);
		}

		return n == 1;
	}

	static int getNextValue(int num) {
		int sum = 0;
		while (num > 0) {
			int value = num % 10;// get last value in number.
			sum += value * value;
			num = num / 10;
		}
		return sum;
	}
}