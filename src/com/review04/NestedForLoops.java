package com.review04;

public class NestedForLoops {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			System.out.println("OUTTER for loop");
			for (int j = 0; j < 2; j++) {
				System.out.println(" inner for loop");
				for (int z = 0; z < 2; z++) {
					System.out.println("   2 inner for loop");
				}
			}
		}
	}
}
