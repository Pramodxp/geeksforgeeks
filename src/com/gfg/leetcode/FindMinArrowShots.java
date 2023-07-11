package com.gfg.leetcode;

import java.util.Arrays;

class FindMinArrowShots {
	public static void main(String[] args) {
//		findMinArrowShots(new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } });
		findMinArrowShots(new int[][] {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}});
	}

	public static int findMinArrowShots(int[][] points) {
		sort(points);
		Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
		int arrow = 1;
		int end = points[0][1];
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > end) {
				arrow++;
				end = points[i][1];
			}
		}
		return arrow;
	}

	// sorts in ascending order
	static void sort(int[][] points) {
		for (int i = 0; i < points.length; i++) {
			for (int j = i+1; j < points.length; j++) {
				if (points[i][1] > points[j][1]) {
					swap(points, i , j);
				}
			}
		}
	}

	static void swap(int[][] points, int i, int j) {
		int[] temp = points[i];
		points[i] = points[j];
		points[j] = temp;
	}
}
