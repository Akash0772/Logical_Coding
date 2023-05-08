package com.akash;
/*
Output
12345
5
45
345
2345
12345
 */
public class Q4 {
	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = 12345 % 10;
		int num3 = 12345 % 100;
		int num4 = 12345 % 1000;
		int num5 = 12345 % 10000;
		int num6 = 12345 % 100000;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
	}
}
