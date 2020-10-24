package com.review04;

public class ForLoop {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			System.out.println("Sum till " + i + " " + (sum = sum + i));

		}
		System.out.println("---");
		sum = 0;
		for (int i = 10; i >= 0; i--) {
			System.out.println("Sum till " + i + " " + (sum = sum + i));

		}

	}

}
