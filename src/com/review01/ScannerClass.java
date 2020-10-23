package com.review01;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

//		String name;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter your name");
//		name = scanner.nextLine();//nextLine - take all
//		System.out.println("My name is "+name);

//		int age;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please you age:");
//		age = scanner.nextInt();
//		if (age <= 18) {
//			System.out.println("You should study");
//		} else {
//			System.out.println("You should work");
//		}

		String name;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please you name");
		name = scanner.nextLine();
		System.out.println("Please enter your age");
		age = scanner.nextInt();// depending data type
		System.out.println("Hi " + name + " you are " + age + " years old");

	}

}
