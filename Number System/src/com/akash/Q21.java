package com.akash;
//Q21. Develop a program to find out if a given number is a prime or not?
/*
Output
Enter a number
2
2 is a prime number
 */
import java.util.Scanner;
public class Q21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0 && num != 1) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
	}
}
