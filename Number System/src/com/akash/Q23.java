package com.akash;
//Q23. Develop a program to print prime numbers between 50 and 100?
//import java.util.Scanner;
/*
Output
53
59
61
67
71
73
79
83
89
97
 */
public class Q23 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int num1 = 50;
		int num2 = 100;
		int count = 0;
		for(int i = num1; i <= num2; i++) {
			count = 0;
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
 	}
}
