package com.akash;

public class A6 {
	public static void main(String[] args) {
		int num1 = 12345;
		int sum = 0;
		int digit;
		while(num1 != 0) {
			digit = num1 % 10;
			sum += digit;
			num1 = num1 / 10;
		}
		System.out.println(sum); //15
	}
}
