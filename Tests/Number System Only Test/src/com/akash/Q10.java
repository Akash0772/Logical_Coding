package com.akash;
/*
Output
11 is Prime true
 */
public class Q10 {
	public static void main(String[] args) {
		int num1 = 11;
		boolean isPrime = true;
		for(int i = 2; i <= (num1 / 2); i++) {
			if(num1 % i == 0) {
				isPrime = true;
				break;
			}
		}
		System.out.println(num1 + " is Prime " + isPrime);
	}
}
