package com.akash;
//	Q38. Print immediate next number in the Fibonacci series? Consider till to 5000.
/*
Output
0, 1
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,  
 */
public class Q37 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		int count = 0;
		System.out.println(num1 + ", " + num2);
		while((num1 + num2) < 5000) {
			count++;
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
		
	}
}
