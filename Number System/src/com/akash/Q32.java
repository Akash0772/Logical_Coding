package com.akash;
// 32. Develop a program to print 30 prime numbers which are having digits in the descending order after 10. (Example: 13, 17, 19, 23, 29, 37, 39, 47,……)
public class Q32 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 200;
		boolean isPrime = true;
		int primeCount = 0;
		while(primeCount < 30) {
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
	}
}
