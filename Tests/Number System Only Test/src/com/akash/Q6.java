package com.akash;
/*
Output
15
 */
public class Q6 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int digit;
		while(num != 0) {
			digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
