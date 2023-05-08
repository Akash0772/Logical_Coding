package com.akash;
/*
Output

 */
public class Q16 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		System.out.println(num1 + ", " + num2);
		int num3;
		while((num1 + num2) < 5000) {
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
	}
}
