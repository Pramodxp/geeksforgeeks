package com.gfg.arrays;

/**
 * @author pramodr
 *
 */
public class Ex1SearchAnElementInAnArray {
	public static void main(String[] args) {
		System.out.println("index of the element is : " + 
	searchIndexOfElement(new int[] { 20, 5, 7, 25 }, 7));
	}

	
	/**
	 * @param arr
	 * @param element
	 * @return
	 * 
	 * time complexity of this search algorithm is O(n)
	 * space complexity is : theta(1)
	 */
	static int searchIndexOfElement(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
