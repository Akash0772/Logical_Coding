package com.akash;

public class A8 {
	public static void main(String[] args) {
		int num1 = 45901223;
		int digitCount = 0;
		int temp = num1;
		
		while(temp != 0) {
			digitCount++;
			temp = temp / 10;
//			System.out.println(digitCount);
		}
		int factor = 1;
		for(int i = 1; i <= (digitCount / 2); i++) {
			factor = factor * 10;
//			System.out.println(factor);
		}
		int num2 = num1 / factor;
		int num3 = num1 % factor;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
