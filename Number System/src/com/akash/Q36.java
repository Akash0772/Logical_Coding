package com.akash;
//	Q36. Print Fibonacci series from 100 to 10000?
/*
Output
55, 89
144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,  
 */
public class Q36 {
	public static void main(String[] args) {
		int num1 = 55;
		int num2 = 89;
		int num3;
		int count = 0;
		System.out.println(num1 + ", " + num2);
		while((num1 + num2) < 10000) {
			count++;
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
		
	}
}
