package com.akash;
//Q10. Find the sum of all even numbers between two given numbers?
/*
Enter the two number
2
10
Sum of all even numbers between two given number is 30
 */
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		for(int i = a; i <= b; i++) {
			if((i % 2) == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of all even numbers between two given number is " + sum);
	}
}
