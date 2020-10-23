package com.review01;

public class StringConcatination {

	public static void main(String[] args) {

		String firstName = "John";
		String lastName = "Smith";
		System.out.println(firstName + lastName);
		String result1 = lastName + 5;
		String result2 = lastName + 5.0;
		String result3 = lastName + 'c';
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		System.out.println('A' + 5 + "name" + 'C' + 45);// 70nameC45
		int charVarA = (int) 'A';
		System.out.println(charVarA);// 65
		int charVarZ = (int) 'Z';
		System.out.println(charVarZ);// 90

		System.out.println(5 + 5 + "name" + 'C' + 45);// 10nameC45
		System.out.println(5.0 + 5 + "name" + 'C' + 45);// 10.0nameC45
		System.out.println(5 + 5 + "name" + 'C' + true);// 10nameCtrue
//		System.out.println(true+5+"name"+'C'+true);//error
		System.out.println(true + "name" + 'C' + true);// truenameCtrue

		char c = 'A';
		System.out.println(c);//A
		System.out.println((int)c);//65
		
		int smily = 9786;
		System.out.println((char)smily);
		System.out.println(smily);

		int sad = 9785;
		System.out.println((char)sad);
		System.out.println(sad);

	}

}
