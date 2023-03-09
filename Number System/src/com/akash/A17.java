package com.akash;

public class A17 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		System.out.print(num1 + ", " + num2 + ", ");
		int num3;
		System.out.println();
		while((num1 + num2) < 5000) {
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
	}
}
