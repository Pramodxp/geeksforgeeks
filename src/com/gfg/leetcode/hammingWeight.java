package com.gfg.leetcode;

public class hammingWeight {
	public static void main(String[] args) {
		System.out.println(hammingWeight(00000000000000000000000000001011));
	}

	// you need to treat n as an unsigned value
	public static int hammingWeight(int n) {
		String binaryFormat=Integer.toBinaryString(n).toString();
		  int count = 0;
	        for(int i=0;i<binaryFormat.length();i++) {
	        	if(binaryFormat.charAt(i) == '1') {
	        		count++;
	        	}
	        }
	        return count;
	}
}