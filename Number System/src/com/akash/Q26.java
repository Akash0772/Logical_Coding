package com.akash;
//Q26. Develop a program to print the sum of initial 30 prime numbers?
/*
Output
129
 */
public class Q26 {
	public static void main(String[] args) {
//		int num = 30;
		int count;
		int sum = 0;
		for(int i = 1; i <= 30; i++) {
			count = 0;
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && i != 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
