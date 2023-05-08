package com.akash;
/*
Output
31, 41, 61, 71, 101, 131, 151, 181, 191, 211, 241, 251, 271, 281, 311, 331, 401, 421, 431, 461, 491, 
 */
public class Q13 {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 500;
		boolean isPrime = true;
		int primeCount = 0;
		while(num1 < num2) {
			for(int i = 2; i <= (num1 / 2); i++) {
				if(num1 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && ((num1 - 1) % 10 == 0)) {
				System.out.print(num1 + ", ");
				primeCount++;
			}
			isPrime = true;
			num1++;
		}
	}
}
