package com.akash;

public class A12 {
	public static void main(String[] args) {
		int num  = 2;
		boolean isPrime = true;
		int primeCount = 0;
		while(primeCount < 10) {
			for(int i = 2; i <= (num / 2); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num + ", ");
				primeCount++;
			}
			isPrime = true;
			num++;
		}
	}
}
