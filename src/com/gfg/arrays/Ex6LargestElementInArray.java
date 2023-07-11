package com.gfg.arrays;

public class Ex6LargestElementInArray {
	public static void main(String[] args) {
		getLargestElementInAnArray(new int[] { 3, 8, 12, 5, 6 });
		getLargestElementInAnArrayEfficient(new int[] { 3, 8, 12, 5, 6 });
	}
	
	//nive approach
	//time : O(nsquare)
	static int getLargestElementInAnArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			boolean flag=true;
			//checks if the future elemtnts has greater elemtnt than the ith element.
			for(int j=0;j<n;j++) {
				if(arr[j]>arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return i;
			}
		}
		return -1;
	}
	
	//effecient approach
	///Time : O(n)
	static int getLargestElementInAnArrayEfficient(int[] arr) {
		int highest = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[highest]) {
				highest = i;
			}
		}
		return highest;
	}
	
	
}
