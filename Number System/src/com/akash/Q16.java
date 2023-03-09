package com.akash;
import java.util.Scanner;
//Q16. Reverse a given number?
/*
Output
Enter a value
54321
12345

 */
public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int digit;
		int revNum = 0;
		while(num != 0) {
			
			digit = num % 10;
			revNum = (revNum * 10) + digit;
			num = num / 10;
		}
		System.out.println(revNum);
	}
}