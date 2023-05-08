package com.akash;
// Develop a program to print prime numbers which are immediately after multiples of 10 and bellow 200.
public class Q29 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 200;
		boolean isPrime = true;
		int primeCount = 0;
		while(num1 < num2) {
			for(int i = 2; i <= (num1 / 2); i++) {
				if(num1 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num1 + ", ");
				primeCount++;
			}
			isPrime = true;
			num1++;
		}
		System.out.println();
		System.out.println(primeCount);
	}
}
