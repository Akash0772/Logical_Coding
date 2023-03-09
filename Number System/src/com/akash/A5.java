package com.akash;

public class A5 {
	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = num1 % 10;
		int num3 = num1 % 100;
		int num4 = num1 % 1000;
		int num5 = num1 % 10000;
		int num6 = num1 % 100000;
		System.out.println(num1); //12345
		System.out.println(num2); //5
		System.out.println(num3); //45
		System.out.println(num4); //345
		System.out.println(num5); //2345
		System.out.println(num6); //12345
	}
}
