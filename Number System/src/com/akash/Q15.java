package com.akash;
import java.util.Scanner;
//Q15. Find out the sum of all digits of a given number?
/*
Output
Enter a value
53246
20

 */
public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int digit;
		int sum = 0;
		while(num != 0) {
			
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
