package com.review02;

public class NestedIfCondition {

	public static void main(String[] args) {

		String name = "Jonh";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 80;
		boolean transferAllowed = true;

		if (pass.contentEquals("pass123")) {
			System.out.println("Welcome to Bank");
			if (transferAllowed) {
				System.out.println("Initiating transfer");
				if (transferAmount > accountBalance) {
					System.out.println("Insufficient balance");
				} else {
					System.out.println("Transfer complete");
				}
			} else {
				System.out.println("You are not allowed to transfer");
			}
		} else {
			System.out.println("Invalid password");
		}
	}
}
