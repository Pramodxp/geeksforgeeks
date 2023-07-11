package com.geeksforgeeks.practice;

import java.util.Scanner;

class ATM {
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter Amount: ");
			int amount = input.nextInt();
			int[] rupees = { 1000, 500, 100, 50 };
			int[] count = { 0, 0, 0, 0 };

			for (int i = 0; i < rupees.length; i++) {
				if (rupees[i] < amount || rupees[i] == amount) {
					count[i] = amount / rupees[i];
					amount = amount % rupees[i];
				}
			}
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					System.out.println(rupees[i] + " * " + count[i] + " = " + (rupees[i] * count[i]));
				}
			}
		} finally {
			input.close();
		}
	}
}
