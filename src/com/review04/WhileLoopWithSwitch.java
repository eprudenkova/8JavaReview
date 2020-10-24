package com.review04;

import java.util.Scanner;

public class WhileLoopWithSwitch {
	public static void main(String[] args) {

		int num1;
		int num2;
		char operation;
		int result;
		boolean continueLoop = true;
		String answer = null;
		while (continueLoop) {
			System.out.println("Please enter 2 numbers");
			Scanner scan = new Scanner(System.in);
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.println("Please enter operator");
			operation = scan.next().charAt(0);
			if (!(operation=='+'||operation=='-'||operation=='*'||operation=='/')) {
				System.out.println("Operation not supported");
				break;
			}
			switch (operation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 - num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				result = 0;
			}
			System.out.println(result);

			System.out.println("Would you like to repeat? yes/no");
//			1.
//			answer = scan.next();
//			if (answer.equalsIgnoreCase("no")) {
//				break;
//			}
//			2.
//			if ("no".equalsIgnoreCase(scan.next())) {
//				continueLoop = false;
//			}
//			3.
			if(scan.next().equalsIgnoreCase("no")){
				continueLoop = false;
			}
		}
	}
}
