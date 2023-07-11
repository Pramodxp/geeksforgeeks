package com.gfg.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {
		int value = 1;
		List<Integer> integerList = null;
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			if (i == 0) {
				integerList = new ArrayList<>();
				integerList.add(value);
				list.add(integerList);
			} else {
				integerList = new ArrayList<>();
				List<Integer> prevIntList = list.get(i - 1);
				for (int j = 0; j <= prevIntList.size(); j++) {
					if (j == 0 || j == prevIntList.size()) {
						integerList.add(value);
					} else {
						integerList.add(prevIntList.get(j)+prevIntList.get(j-1));
					}
				}
				list.add(integerList);
			}

		}
		return list;
	}

}
