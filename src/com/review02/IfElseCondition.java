package com.review02;

public class IfElseCondition {

	public static void main(String[] args) {

		int a = 0;

//		1.
//		System.out.println("Start");
//		
//		if (a>0) {
//			System.out.println("Number "+a+" is greater then 0");
//		}
//		
//		System.out.println("Finish");

//		2.
//		System.out.println("Start");
//		
//		if (a>0) {
//			System.out.println("Number "+a+" is greater then 0");
//		}else {
//			System.out.println("Number "+a+" is smaller then 0");
//		}
//		
//		System.out.println("Finish");

//		3.
		System.out.println("Start");

		if (a > 0) {
			System.out.println("Number " + a + " is greater then 0");
		} else if (a < 0) {
			System.out.println("Number " + a + " is smaller then 0");
		} else {
			System.out.println("Number " + a + " is equal to 0");
		}

		System.out.println("Finish");
	}

}
