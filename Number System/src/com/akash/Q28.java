package com.akash;
//Q28. Develop a program to print prime numbers in the reverse order from 70 to 20?
/*
Output
69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 
 */
public class Q28 {
	public static void main(String[] args) {
		int num1 = 70;
		int num2 = 20;
		int count = 0;
		for(int i = 70; i >= 20; i--) {
			count = 0;
			for(int j = 2; j <= i / 2; j++) {
				if(i % 2 == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && i != 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
