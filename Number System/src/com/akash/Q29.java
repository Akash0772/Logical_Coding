package com.akash;
// Develop a program to print prime numbers which are immediately after multiples of 10 and bellow 200.
public class Q29 {
	public static boolean isPrime(int n) {
		if(n % 2 == 0 || n % 1 == 0) {
			return true;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return true;
			}else {
				return false;
			}
		}
		return isPrime(n);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(isPrime(n));
	}
}
