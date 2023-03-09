package com.akash;

public class A14 {
	public static void main(String[] args) {
		int num1  = 10;
		int num2 = 500;
		boolean isPrime = true;
	
		while(num1 < num2) {
			for(int i = 2; i <= (num1 / 2); i++) {
				if(num1 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && ((num1 - 1) % 10 == 0)) {
				System.out.print(num1 + ", ");
			}
			isPrime = true;
			num1++;
		}
	}
}
