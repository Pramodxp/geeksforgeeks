package com.gfg.leetcode;

public class AmstrongNumber {

	public static void main(String[] args) {

		if (amstrongNumber(153)) {
			System.out.println("is amstrong number");
		} else {
			System.out.println("not amstrong number");
		}
	}

	private static boolean amstrongNumber(int number) {
		int copyNumber = number;
		System.out.println(copyNumber);
		int sum = 0;
		while (copyNumber > 0) {
			int lastDigit = copyNumber % 10;
			sum += lastDigit * lastDigit * lastDigit;
			copyNumber = copyNumber / 10;
		}

		System.out.println(sum);
		if (number == sum) {
			return true;
		} else {
			return false;
		}
	}
}
