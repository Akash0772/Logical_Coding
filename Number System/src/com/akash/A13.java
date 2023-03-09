package com.akash;

public class A13 {
	public static void main(String[] args) {
		int num1  = 20;
		int num2 = 500;
		boolean isPrime = true;
	
		while(num1 < num2) {
			for(int i = 2; i <= (num1 / 2); i++) {
				if(num1 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num1 + ", ");
			}
			isPrime = true;
			num1++;
		}
	}
}
