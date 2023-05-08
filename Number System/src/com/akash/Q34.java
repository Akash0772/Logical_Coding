package com.akash;
//	Q34. Print Fibonacci series till to 100.
/*
Output
0, 1
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
 */
public class Q34 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1 + ", " + num2);
		while((num1 + num2) < 100) {
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
		
	}
}
