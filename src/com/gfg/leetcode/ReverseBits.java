package com.gfg.leetcode;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(hammingWeight(00000000000000000000000000001011));
	}

	// you need to treat n as an unsigned value
	public static int hammingWeight(int n) {
		String binaryFormat = Integer.toBinaryString(n).toString();
		int count = 0;
		for (int i = binaryFormat.length()-1; i >= 0; i--) {
			System.out.print(binaryFormat.charAt(i));
		}
		return count;
	}
}