package com.gfg.leetcode;

public class MultiplyOtherIndexesAndPlaceToCurrentIndex {

	public static void main(String[] args) {
		int[] array = { 2, 5, 9, 6 };
		int currentIndex = 0;
		int[] resultArray = new int[array.length];
		currentIndex(array, currentIndex, resultArray);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
	}

	private static void currentIndex(int[] array, int currentIndex, int[] resultArray) {
		if (currentIndex > array.length) {
			return;
		}
		int result = 1;
		for (int i = 0; i < array.length; i++) {
			if (currentIndex == i) {
				continue;
			}
			result *= array[i];
		}
		if (currentIndex < resultArray.length) {
			resultArray[currentIndex] = result;
		}
		currentIndex++;
		currentIndex(array, currentIndex, resultArray);
	}

}
