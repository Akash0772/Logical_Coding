package com.akash;
//	Q35. Print initial 10 numbers from the Fibonacci series.
/*
Output
0, 1
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
 */
public class Q35 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		int count = 0;
		System.out.println(num1 + ", " + num2);
		while(count < 10) {
			count++;
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
		
	}
}
