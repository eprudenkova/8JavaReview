package com.review01;

public class Casting {

	public static void main(String[] args) {

		byte byteVar = 10;
		short shortVar = 100;
		char charVar = 'A';
		int intVar = 1000;
		long longVar = 10000;
		float floatVar = 100000;
		double doubleVar = 1000000;
		
		shortVar=byteVar;
		System.out.println(shortVar);//10
		intVar=charVar;
		System.out.println(intVar);//65
		
		floatVar=(float)doubleVar;
		System.out.println(floatVar);//1000000.0
		
		byteVar=(byte)shortVar;
		System.out.println(byteVar);//random number
		
		byte byteNewVar =100;
//		short shortNewVar = byteNewVar+10;//error
		short shortNewVar = (short)(byteNewVar+10);
		System.out.println(shortNewVar);//110
		
		int intNewVar = 100;
		long longNewVar = 2147483647;
		System.out.println(longNewVar);
//		long longNewVar1 = 2147483648;//error
		long longNewVar1 = 2147483648L;
		System.out.println(longNewVar1);
		
		float floatNewVar = 145.02f;// if NOT f it will be as doubles by default
//		float floatNewVar = 145.02;//error
		System.out.println(floatNewVar);
		


	}

}
