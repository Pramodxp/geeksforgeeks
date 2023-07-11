package com.gfg.arrays.sort;

import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10);
		}

		System.out.println("before sorting the values : ");
		printValues(numbers);

		// using merge sort
		bubbleSort(numbers);

		System.out.println("\nafter sorting the values : ");
		printValues(numbers);
	}

	private static void bubbleSort(int[] array) {
		boolean elementSwapped = true;
		while (elementSwapped) {
			elementSwapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					elementSwapped = true;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}

	private static void printValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" ,"+numbers[i]);
		}
	}
}
