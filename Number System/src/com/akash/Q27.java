package com.akash;
//27. Develop a program to print sum of prime numbers between two given numbers?
/*
Output
Enter two number
2
10
26

 */
import java.util.Scanner;
public class Q27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count, sum = 0;
		for(int i = num1; i <= num2; i++) {
			count = 0;
			for(int j = 2; j <= i / 2; j++) {
				if(i % 2 == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && i != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
