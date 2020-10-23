package com.review02;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter your gender:");
		char gender = userIn.next().charAt(0);
		System.out.println("Please enter your age:");
		int age = userIn.nextInt();

		if (gender == 'M') {
			if (age >= 25) {
				System.out.println("Man");
			} else {
				System.out.println("Boy");
			}
		}
		if (gender == 'F') {
			if (age >= 25) {
				System.out.println("Woman");
			} else {
				System.out.println("Girl");
			}
		}

	}

}
