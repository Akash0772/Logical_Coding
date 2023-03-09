package com.akash;
//Q24. Develop a program to print prime numbers between two given numbers? 
/*
Output
Enter two number
1
20
1
2
3
5
7
11
13
17
19
 */
import java.util.Scanner;
public class Q24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
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
