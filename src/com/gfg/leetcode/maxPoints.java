package com.gfg.leetcode;

import java.util.HashMap;
import java.util.Map;

/*Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return 
 * the maximum number of points that lie on the same straight line.*/

/*Constraints:

1 <= points.length <= 300
points[i].length == 2
-104 <= xi, yi <= 104
All the points are unique.*/

/*
 * Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
Output: 4*/
class maxPoints {
	public static void main(String[] args) {
		
	}
	public static int maxPoints(int[][] points) {
		if (points.length < 3)
			return points.length;
		int maxPoints = 0;
		for (int[] cord1 : points) {
			Map<Double, Integer> hm = new HashMap<>();
			for (int[] cord2 : points) {
				if (cord1 == cord2)
					continue;
				double slope = 0;
				if (cord2[0] == cord1[0])
					slope = Double.POSITIVE_INFINITY;
				else {
					slope = (cord2[1] - cord1[1]) / (double) (cord2[0] - cord1[0]);
				}
				hm.put(slope, hm.getOrDefault(slope, 0) + 1);
				if (hm.get(slope) > maxPoints)
					maxPoints = hm.get(slope);
			}
		}
		return maxPoints + 1;
	}
}