package com.gfg.leetcode;

public class FibonacciSeries {
	public static void main(String[] args) {
		fibonacciSeries(5);
	}
	
	private static void fibonacciSeries(int number) {
		int start = 0;
		int first = 1;
		int sum = 0;
		System.out.println(start);
		for(int i=0;i<number;i++) {
			System.out.println(first);
			sum += first;
			int temp = first;
			first = temp + start;
			start = temp;
		}
		System.err.println("sum of all the fibonacci series is : "+sum);
	}
}
